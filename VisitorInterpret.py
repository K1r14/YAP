from antlr4 import *
from mrlangParser import mrlangParser
from mrlangVisitor import mrlangVisitor

def prepareVal(value, type):
    return {"value": value, "type": type}

class VisitorInterpret(mrlangVisitor):
    def __init__(self):
        self.names = dict()

    def visitProgram(self, ctx:mrlangParser.ProgramContext):
        for i in range(0, ctx.getChildCount()):
            self.visit(ctx.getChild(i))
        return 0

    def visitStmt(self, ctx:mrlangParser.StmtContext):
        return self.visit(ctx.getChild(0))


    def visitExpr(self, ctx:mrlangParser.ExprContext):
        if (ctx.getChild(0).getText() == '('):
            return self.visit(ctx.getChild(1))
        if (ctx.getChildCount() == 3):
            op = self.visit(ctx.getChild(1))
            left = self.visit(ctx.getChild(0))
            if (left["type"] == "string"):
                raise ValueError("Left operand is string.")
            right = self.visit(ctx.getChild(2))
            if (right["type"] == "string"):
                raise ValueError("Right operand is string.")
            if (op == "+"):
                return prepareVal(int(left["value"]) + int(right["value"]), "int")
            if (op == "-"):
                return prepareVal(int(left["value"]) - int(right["value"]), "int")
            if (op == "*"):
                return prepareVal(int(left["value"]) * int(right["value"]), "int")
            if (op == "/"):
                if (int(right["value"]) == 0):
                    raise ValueError("ZeroDevision occured")
                return prepareVal(int(left["value"]) // int(right["value"]), "int")
            if (op == "<"):
                return prepareVal(int(left["value"]) < int(right["value"]), "bool")
            if (op == "<="):
                return prepareVal(int(left["value"]) <= int(right["value"]), "bool")
            if (op == "=="):
                if (left["type"] == "int" and right["type"] == "int"):
                    return prepareVal(int(left["value"]) == int(right["value"]), "bool")
                else:
                    return prepareVal(bool(left["value"]) == bool(right["value"]), "bool")
            if (op == "!="):
                if (left["type"] == "int" and right["type"] == "int"):
                    return prepareVal(int(left["value"]) != int(right["value"]), "bool")
                else:
                    return prepareVal(bool(left["value"]) != bool(right["value"]), "bool")
            if (op == ">"):
                return prepareVal(int(left["value"]) > int(right["value"]), "bool")
            if (op == ">="):
                return prepareVal(int(left["value"]) >= int(right["value"]), "bool")
            if (op == "&&"):
                return prepareVal(bool(left["value"]) < bool(right["value"]), "bool")
            if (op == "||"):
                return prepareVal(bool(left["value"]) < bool(right["value"]), "bool")
        val = self.visit(ctx.getChild(1)) if (ctx.getChildCount() == 2) else self.visit(ctx.getChild(0))
        if (val["value"] == None):
            raise ValueError("Использована не инциализированная переменная")
        if (ctx.getChildCount() == 2 and val["type"] == "int"):
            val["value"] = int(-val["value"]);
        if (ctx.getChildCount() == 2 and val["type"] == "bool"):
            val["value"] = bool(not val["value"]);
        if (ctx.getChildCount() == 2 and val["type"] == "string"):
            raise ValueError("Нельзя инвертировать строки по значению")
        return val


    def visitVarDecl(self, ctx:mrlangParser.VarDeclContext):
        return self.visit(ctx.getChild(0))


    def visitRawVarDecl(self, ctx:mrlangParser.RawVarDeclContext):
        self.names[ctx.getChild(1).getText()] = prepareVal(None, self.visit(ctx.getChild(0)))
        return 0

    def visitFilledVarDecl(self, ctx:mrlangParser.FilledVarDeclContext):
        val = self.visit(ctx.getChild(3))
        typename = self.visit(ctx.getChild(0))
        if (typename != val["type"]):
            raise ValueError("Неправильная инициализация переменной")
        self.names[ctx.getChild(1).getText()] = val
        return 0


    def visitTypeName(self, ctx:mrlangParser.TypeNameContext):
        if (ctx.getText() == "int"):
            return "int"
        if (ctx.getText() == "str"):
            return "string"
        if (ctx.getText() == "bool"):
            return "bool"

    def visitAssignment(self, ctx:mrlangParser.AssignmentContext):
        return self.visit(ctx.getChild(0))

    def visitRawAssigment(self, ctx:mrlangParser.RawAssigmentContext):
        val = self.names[ctx.getChild(0).getText()]
        new_val = self.visit(ctx.getChild(2))
        if (val["type"] != new_val["type"]):
            raise ValueError("Неправильное присвоение переменной")
        self.names[ctx.getChild(0).getText()] = new_val
        return 0
    
    def visitIdName(self, ctx:mrlangParser.IdNameContext):
        return self.names[ctx.getText()]

    def visitNumParsed(self, ctx:mrlangParser.NumParsedContext):
        return prepareVal(int(ctx.getText()), "int")
    
    def visitBoolParsed(self, ctx:mrlangParser.BoolParsedContext):
        if (ctx.getText() == "true"):
            return prepareVal(True, "bool")
        elif (ctx.getText() == "false"):
            return prepareVal(False, "bool")

    def visitStringParsed(self, ctx:mrlangParser.StringParsedContext):
        return prepareVal(str(ctx.getText()), "string")
    
    def visitAritOperator(self, ctx:mrlangParser.AritOperatorContext):
        return ctx.getText()

    def visitCompOperator(self, ctx:mrlangParser.CompOperatorContext):
        return ctx.getText()


    def visitPrint(self, ctx:mrlangParser.PrintContext):
        val = self.visit(ctx.getChild(2))
        if (val["type"] == "bool"):
            print("true" if val["value"] else "false")
        else:
            print(val["value"])
        return 0


    def visitBlockstmt(self, ctx:mrlangParser.BlockstmtContext):
        for i in range(1, ctx.getChildCount()-1):
            self.visit(ctx.getChild(i))
        return 0

    def visitIfstmt(self, ctx:mrlangParser.IfstmtContext):
        valpred = self.visit(ctx.getChild(2))
        if (valpred["type"] == "string"):
            raise ValueError("Строка не может быть предикатом")
        pred = bool(valpred["value"])
        if (pred):
            return self.visit(ctx.getChild(4))
        for i in range(5, ctx.getChildCount()):
            if (self.visit(ctx.getChild(i))):
                break
        return pred

    def visitElifstmt(self, ctx:mrlangParser.ElifstmtContext):
        valpred = self.visit(ctx.getChild(2))
        if (valpred["type"] == "string"):
            raise ValueError("Строка не может быть предикатом")
        pred = bool(valpred["value"])
        if (pred):
            return self.visit(ctx.getChild(4))
        return pred


    def visitElsestmt(self, ctx:mrlangParser.ElsestmtContext):
        return self.visit(ctx.getChild(1))


    def visitWhilestmt(self, ctx:mrlangParser.WhilestmtContext):
        valpred = self.visit(ctx.getChild(2))
        if (valpred["type"] == "string"):
            raise ValueError("Строка не может быть предикатом")
        while(valpred["value"]):
            self.visit(ctx.getChild(4))
            valpred = self.visit(ctx.getChild(2))
            if (valpred["type"] == "string"):
                raise ValueError("Строка не может быть предикатом")
        return 0


    def visitForstmt(self, ctx:mrlangParser.ForstmtContext):
        self.visit(ctx.getChild(2))
        valpred = self.visit(ctx.getChild(4))
        if (valpred["type"] == "string"):
            raise ValueError("Строка не может быть предикатом")
        while(valpred["value"]):
            self.visit(ctx.getChild(8))
            self.visit(ctx.getChild(6))
            valpred = self.visit(ctx.getChild(4))
            if (valpred["type"] == "string"):
                raise ValueError("Строка не может быть предикатом")
        return 0
