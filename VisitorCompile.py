from antlr4 import *
from mrlangParser import mrlangParser
from mrlangVisitor import mrlangVisitor
import re

def prepareVal(value, type):
    return {"value": value, "type": type}

class VisitorCompile(mrlangVisitor):
    def __init__(self):
        self.code = []
        self.variables = {}
        self.current_address = 0x200
        self.label_counter = 0
        self.free_regs = [1 for _ in range(32)]


    def free_reg(self, idx):
        self.free_regs[idx] = 1

    def get_free_reg(self):
        for i in range(1, len(self.free_regs)):
            if self.free_regs[i]:
                self.free_regs[i] = 0
                return i
        return 0

    def new_label(self, prefix="L"):
        self.label_counter += 1
        return f"{prefix}{self.label_counter}"

    def emit(self, instruction):
        self.code.append(instruction)

    def visitProgram(self, ctx: mrlangParser.ProgramContext):
        for i in range(ctx.getChildCount()):
            self.visit(ctx.getChild(i))
        self.emit("ebreak\n")
        return "".join(self.code)

    def visitVarDecl(self, ctx: mrlangParser.VarDeclContext):
        self.visit(ctx.getChild(0))

    def visitRawVarDecl(self, ctx: mrlangParser.RawVarDeclContext):
        typename = self.visit(ctx.getChild(0))
        name = ctx.getChild(1).getText()
        self.variables[name] = {"type":typename, "addr":self.current_address}
        self.current_address += 1

    def parseExpression(self, expression):
        expression = expression.replace(" ", "")
        operands = []
        operators = []
        precedence = {'<': 0, '<=': 0, '>': 0, '>=': 0, '==': 0, '!=': 0, '+': 1, '-': 1, '||': 1, '*': 2, '/': 2, '&&': 2}
        temp_reg = ""
        def parse_token(expr):
            tokens = re.findall(r'[A-Za-z0-9]+|\d+|[+\-*/()<>]|<=|>=|==|!=|\|\||&&', expr)
            return tokens
        def process_operator():
            nonlocal temp_reg
            b = operands.pop()
            a = operands.pop()
            op = operators.pop()
            temp_reg = f"x{self.get_free_reg()}" 
            if op == "+":
                self.emit(f"add {temp_reg}, {a}, {b}\n")
            elif op == "-":
                self.emit(f"sub {temp_reg}, {a}, {b}\n")
            elif op == "*":
                self.emit(f"mul {temp_reg}, {a}, {b}\n")
            elif op == "/":
                self.emit(f"div {temp_reg}, {a}, {b}\n")
            elif op == ">":
                self.emit(f"slt {temp_reg}, {a}, {b}\n")
                temp_temp_reg = f"x{self.get_free_reg()}"
                self.emit(f"seq {temp_temp_reg}, {a}, {b}\n")
                self.emit(f"or {temp_reg}, {temp_reg}, {temp_temp_reg}\n")
                self.emit(f"seq {temp_reg}, {temp_reg}, x0\n")
                self.free_reg(int(temp_temp_reg[1]))
            elif op == ">=":
                self.emit(f"sge {temp_reg}, {a}, {b}\n")
            elif op == "<":
                self.emit(f"slt {temp_reg}, {a}, {b}\n")
            elif op == "<=":
                self.emit(f"slt {temp_reg}, {a}, {b}\n")
                temp_temp_reg = f"x{self.get_free_reg()}"
                self.emit(f"seq {temp_temp_reg}, {a}, {b}\n")
                self.emit(f"or {temp_reg}, {temp_reg}, {temp_temp_reg}\n")
                self.free_reg(int(temp_temp_reg[1]))
            elif op == "==":
                self.emit(f"seq {temp_reg}, {a}, {b}\n")
            elif op == "!=":
                self.emit(f"sne {temp_reg}, {a}, {b}\n")
            elif op == "&&":
                self.emit(f"and {temp_reg}, {a}, {b}\n")
            elif op == "||":
                self.emit(f"or {temp_reg}, {a}, {b}\n")
            operands.append(temp_reg)
            self.free_reg(int(a[1]))
            self.free_reg(int(b[1]))

        tokens = parse_token(expression)
        if len(tokens) == 1:
            return tokens[0] # no operators
        
        for token in tokens:
            if token in precedence:
                while (operators and operators[-1] != '(' and
                    precedence[operators[-1]] >= precedence[token]):
                    process_operator()
                operators.append(token)
            elif token == '(':
                operators.append(token)
            elif token == ')':
                while operators and operators[-1] != '(':
                    process_operator()
                if operators and operators[-1] == '(':
                    operators.pop()
            else:
                operands.append(token)
        while operators:
            process_operator()

        return temp_reg
    
    def visitFilledVarDecl(self, ctx: mrlangParser.FilledVarDeclContext):
        typename = self.visit(ctx.getChild(0))
        name = ctx.getChild(1).getText()
        self.variables[name] = {"type":typename, "addr":self.current_address}
        self.current_address += 1
        value = self.visit(ctx.getChild(3))
        if (typename != value["type"]):
            raise ValueError("Wrong assigment type")
        res_reg = self.parseExpression(value["value"])
        addr = self.variables[name]["addr"]
        self.emit(f"sw x0, {addr}, {res_reg}\n")
        self.free_reg(int(res_reg[1]))
    
    def visitTypeName(self, ctx:mrlangParser.TypeNameContext):
        if (ctx.getText() == "int"):
            return "int"
        if (ctx.getText() == "str"):
            return "string"
        if (ctx.getText() == "bool"):
            return "bool"

    def visitAssignment(self, ctx: mrlangParser.AssignmentContext):
        self.visit(ctx.getChild(0))


    def visitRawAssigment(self, ctx: mrlangParser.RawAssigmentContext):
        name = ctx.getChild(0).getText()
        if name not in self.variables:
            raise ValueError(f"Переменная {name} не объявлена\n")
        address = self.variables[name]["addr"]
        value = self.visit(ctx.getChild(2))
        pred = self.variables[name]["type"] == "string" or value["type"] == "string"
        pred = pred and (self.variables[name]["type"] != "string" or value["type"] != "string")
        if (pred):
            raise ValueError("Wrong assigment")
        res_reg = self.parseExpression(value["value"])
        self.emit(f"sw x0, {address}, {res_reg}\n")
        self.free_reg(int(res_reg[1]))

    def visitExpr(self, ctx: mrlangParser.ExprContext):
        if ctx.getChildCount() == 1:
            return self.visit(ctx.getChild(0))
        elif ctx.getChildCount() == 3:
            if ctx.getChild(0).getText() == '(':
                child = self.visit(ctx.getChild(1))
                text = child["value"]
                return prepareVal(f"({text})", child["type"])
            else:
                left = self.visit(ctx.getChild(0))
                right = self.visit(ctx.getChild(2))
                operator = ctx.getChild(1).getText()
                if (left["type"] != right["type"]):
                    raise ValueError("Wrong operator types")
                left_text = left["value"]
                right_text = right["value"]
                return prepareVal(f"{left_text}{operator}{right_text}", left["type"])
        else:
            value = ctx.getChild(1).getText()
            temp_reg = f"x{self.get_free_reg()}"
            self.emit(f"li {temp_reg}, -{value}\n")
            return prepareVal(temp_reg, "int")

    def visitNumParsed(self, ctx: mrlangParser.NumParsedContext):
        value = ctx.getText()
        temp_reg = f"x{self.get_free_reg()}"
        self.emit(f"li {temp_reg}, {value}\n")
        return prepareVal(temp_reg, "int")
    
    def visitBoolParsed(self, ctx: mrlangParser.BoolParsedContext):
        value = 1 if ctx.getText() == "true" else 0
        temp_reg = f"x{self.get_free_reg()}" 
        self.emit(f"li {temp_reg}, {value}\n")
        return prepareVal(temp_reg, "bool")

    def visitStringParsed(self, ctx: mrlangParser.StringParsedContext):
        string = ctx.getText().replace("\"", "")
        temp_reg = f"x{self.get_free_reg()}" 
        start_addr = self.current_address
        for char in string:
            self.emit(f"li {temp_reg}, {ord(char)}\n")
            self.emit(f"sw x0, {self.current_address}, {temp_reg}\n")
            self.current_address += 1
        self.emit(f"li {temp_reg}, 0\n")
        self.emit(f"sw x0, {self.current_address}, {temp_reg}\n")
        self.current_address += 1
        self.emit(f"li {temp_reg}, {start_addr}\n")
        return prepareVal(temp_reg, "string")
    
    def visitIdName(self, ctx: mrlangParser.IdNameContext):
        name = ctx.getText()
        if name not in self.variables:
            raise ValueError(f"Переменная {name} не объявлена\n")
        address = self.variables[name]["addr"]
        temp_reg = f"x{self.get_free_reg()}"
        self.emit(f"lw {temp_reg}, x0, {address}\n")
        return prepareVal(temp_reg, self.variables[name]["type"])

    def visitPrint(self, ctx: mrlangParser.PrintContext):
        value = self.visit(ctx.getChild(2))
        res_reg = self.parseExpression(value["value"])
        temp_reg = f"x{self.get_free_reg()}" 
        
        if (value["type"] == "string"):
            loop_label = self.new_label("PRINT_START")
            end_label = self.new_label("PRINT_END") 
            self.emit(f"{loop_label}:\n")
            self.emit(f"lw {temp_reg}, {res_reg}, 0\n")
            self.emit(f"beq {temp_reg}, x0, {end_label}\n")
            self.emit(f"ewrite {temp_reg}\n")
            self.emit(f"addi {res_reg}, {res_reg}, 1\n")
            self.emit(f"jal x0, {loop_label}\n")
            self.emit(f"{end_label}:\n")
        elif (value["type"] == "int"):
            self.emit(f"iwrite {res_reg}\n")
        elif (value["type"] == "bool"):
            print_label = self.new_label("BOOL_PRINT")
            self.emit(f"beq {res_reg}, x0, {print_label}\n")
            self.emit(f"li {temp_reg}, {ord('d')}\n")
            self.emit(f"ewrite {temp_reg}\n")
            self.emit(f"li {temp_reg}, {ord('o')}\n")
            self.emit(f"ewrite {temp_reg}\n")
            self.emit(f"li {temp_reg}, {ord('b')}\n")
            self.emit(f"ewrite {temp_reg}\n")
            self.emit(f"li {temp_reg}, {ord('r')}\n")
            self.emit(f"ewrite {temp_reg}\n")
            self.emit(f"li {temp_reg}, {ord('o')}\n")
            self.emit(f"ewrite {temp_reg}\n")

            self.emit(f"{print_label}:\n")
            
            self.emit(f"li {temp_reg}, {ord('l')}\n")
            self.emit(f"ewrite {temp_reg}\n")
            self.emit(f"li {temp_reg}, {ord('z')}\n")
            self.emit(f"ewrite {temp_reg}\n")
            self.emit(f"li {temp_reg}, {ord('h')}\n")
            self.emit(f"ewrite {temp_reg}\n")
            self.emit(f"li {temp_reg}, {ord('a')}\n")
            self.emit(f"ewrite {temp_reg}\n")

        self.emit(f"li {temp_reg}, {10}\n")
        self.emit(f"ewrite {temp_reg}\n")

        self.free_reg(int(temp_reg[1]))
        self.free_reg(int(res_reg[1]))


    def visitWhilestmt(self, ctx: mrlangParser.WhilestmtContext):
        loop_label = self.new_label("WHILE_LOOP")
        end_label = self.new_label("WHILE_END")

        self.emit(f"{loop_label}:\n")
        condition = self.visit(ctx.getChild(2))
        if (condition["type"] == "string"):
            raise ValueError("String can't be condition")
        res_reg = self.parseExpression(condition["value"])
        self.emit(f"beq {res_reg}, x0, {end_label}\n")

        self.visit(ctx.getChild(4))
        self.emit(f"jal x0, {loop_label}\n")
        self.emit(f"{end_label}:\n")

    def visitForstmt(self, ctx: mrlangParser.ForstmtContext):
        init_label = self.new_label("FOR_INIT")
        loop_label = self.new_label("FOR_LOOP")
        end_label = self.new_label("FOR_END")

        self.visit(ctx.getChild(2))
        self.emit(f"{init_label}:\n")
        condition = self.visit(ctx.getChild(4)) 
        if (condition["type"] == "string"):
            raise ValueError("String can't be condition")
        res_reg = self.parseExpression(condition["value"])
        self.emit(f"beq {res_reg}, x0, {end_label}\n")

        self.visit(ctx.getChild(8))
        
        self.visit(ctx.getChild(6))
        self.emit(f"jal x0, {init_label}\n")
        self.emit(f"{end_label}:\n")

    def visitIfstmt(self, ctx: mrlangParser.IfstmtContext):
        cond_label = self.new_label("IF_COND")
        end_label = self.new_label("IF_END")

        condition = self.visit(ctx.getChild(2))
        if (condition["type"] == "string"):
            raise ValueError("String can't be condition")
        res_reg = self.parseExpression(condition["value"])
        self.emit(f"beq {res_reg}, x0, {cond_label}\n")

        self.visit(ctx.getChild(4))
        self.emit(f"jal x0, {end_label}\n")

        self.emit(f"{cond_label}:\n")
        for i in range(5, ctx.getChildCount()):
            elif_label = self.visit(ctx.getChild(i))
            if (isinstance(ctx.getChild(i), mrlangParser.ElifstmtContext)):
                self.emit(f"jal x0, {end_label}\n")
                self.emit(f"{elif_label}:\n")

        self.emit(f"{end_label}:\n")

    def visitElifstmt(self, ctx: mrlangParser.ElifstmtContext):
        next_label = self.new_label("ELIF_NEXT")

        condition = self.visit(ctx.getChild(2))
        if (condition["type"] == "string"):
            raise ValueError("String can't be condition")
        res_reg = self.parseExpression(condition["value"])
        self.emit(f"beq {res_reg}, x0, {next_label}\n")

        self.visit(ctx.getChild(4))
        return next_label

    def visitElsestmt(self, ctx: mrlangParser.ElsestmtContext):
        self.visit(ctx.getChild(1))
