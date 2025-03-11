# Generated from mrlang.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .mrlangParser import mrlangParser
else:
    from mrlangParser import mrlangParser

# This class defines a complete listener for a parse tree produced by mrlangParser.
class mrlangListener(ParseTreeListener):

    # Enter a parse tree produced by mrlangParser#program.
    def enterProgram(self, ctx:mrlangParser.ProgramContext):
        pass

    # Exit a parse tree produced by mrlangParser#program.
    def exitProgram(self, ctx:mrlangParser.ProgramContext):
        pass


    # Enter a parse tree produced by mrlangParser#stmt.
    def enterStmt(self, ctx:mrlangParser.StmtContext):
        pass

    # Exit a parse tree produced by mrlangParser#stmt.
    def exitStmt(self, ctx:mrlangParser.StmtContext):
        pass


    # Enter a parse tree produced by mrlangParser#expr.
    def enterExpr(self, ctx:mrlangParser.ExprContext):
        pass

    # Exit a parse tree produced by mrlangParser#expr.
    def exitExpr(self, ctx:mrlangParser.ExprContext):
        pass


    # Enter a parse tree produced by mrlangParser#varDecl.
    def enterVarDecl(self, ctx:mrlangParser.VarDeclContext):
        pass

    # Exit a parse tree produced by mrlangParser#varDecl.
    def exitVarDecl(self, ctx:mrlangParser.VarDeclContext):
        pass


    # Enter a parse tree produced by mrlangParser#rawVarDecl.
    def enterRawVarDecl(self, ctx:mrlangParser.RawVarDeclContext):
        pass

    # Exit a parse tree produced by mrlangParser#rawVarDecl.
    def exitRawVarDecl(self, ctx:mrlangParser.RawVarDeclContext):
        pass


    # Enter a parse tree produced by mrlangParser#filledVarDecl.
    def enterFilledVarDecl(self, ctx:mrlangParser.FilledVarDeclContext):
        pass

    # Exit a parse tree produced by mrlangParser#filledVarDecl.
    def exitFilledVarDecl(self, ctx:mrlangParser.FilledVarDeclContext):
        pass


    # Enter a parse tree produced by mrlangParser#typeName.
    def enterTypeName(self, ctx:mrlangParser.TypeNameContext):
        pass

    # Exit a parse tree produced by mrlangParser#typeName.
    def exitTypeName(self, ctx:mrlangParser.TypeNameContext):
        pass


    # Enter a parse tree produced by mrlangParser#assignment.
    def enterAssignment(self, ctx:mrlangParser.AssignmentContext):
        pass

    # Exit a parse tree produced by mrlangParser#assignment.
    def exitAssignment(self, ctx:mrlangParser.AssignmentContext):
        pass


    # Enter a parse tree produced by mrlangParser#rawAssigment.
    def enterRawAssigment(self, ctx:mrlangParser.RawAssigmentContext):
        pass

    # Exit a parse tree produced by mrlangParser#rawAssigment.
    def exitRawAssigment(self, ctx:mrlangParser.RawAssigmentContext):
        pass


    # Enter a parse tree produced by mrlangParser#idName.
    def enterIdName(self, ctx:mrlangParser.IdNameContext):
        pass

    # Exit a parse tree produced by mrlangParser#idName.
    def exitIdName(self, ctx:mrlangParser.IdNameContext):
        pass


    # Enter a parse tree produced by mrlangParser#numParsed.
    def enterNumParsed(self, ctx:mrlangParser.NumParsedContext):
        pass

    # Exit a parse tree produced by mrlangParser#numParsed.
    def exitNumParsed(self, ctx:mrlangParser.NumParsedContext):
        pass


    # Enter a parse tree produced by mrlangParser#stringParsed.
    def enterStringParsed(self, ctx:mrlangParser.StringParsedContext):
        pass

    # Exit a parse tree produced by mrlangParser#stringParsed.
    def exitStringParsed(self, ctx:mrlangParser.StringParsedContext):
        pass


    # Enter a parse tree produced by mrlangParser#boolParsed.
    def enterBoolParsed(self, ctx:mrlangParser.BoolParsedContext):
        pass

    # Exit a parse tree produced by mrlangParser#boolParsed.
    def exitBoolParsed(self, ctx:mrlangParser.BoolParsedContext):
        pass


    # Enter a parse tree produced by mrlangParser#aritOperator.
    def enterAritOperator(self, ctx:mrlangParser.AritOperatorContext):
        pass

    # Exit a parse tree produced by mrlangParser#aritOperator.
    def exitAritOperator(self, ctx:mrlangParser.AritOperatorContext):
        pass


    # Enter a parse tree produced by mrlangParser#compOperator.
    def enterCompOperator(self, ctx:mrlangParser.CompOperatorContext):
        pass

    # Exit a parse tree produced by mrlangParser#compOperator.
    def exitCompOperator(self, ctx:mrlangParser.CompOperatorContext):
        pass


    # Enter a parse tree produced by mrlangParser#print.
    def enterPrint(self, ctx:mrlangParser.PrintContext):
        pass

    # Exit a parse tree produced by mrlangParser#print.
    def exitPrint(self, ctx:mrlangParser.PrintContext):
        pass


    # Enter a parse tree produced by mrlangParser#blockstmt.
    def enterBlockstmt(self, ctx:mrlangParser.BlockstmtContext):
        pass

    # Exit a parse tree produced by mrlangParser#blockstmt.
    def exitBlockstmt(self, ctx:mrlangParser.BlockstmtContext):
        pass


    # Enter a parse tree produced by mrlangParser#ifstmt.
    def enterIfstmt(self, ctx:mrlangParser.IfstmtContext):
        pass

    # Exit a parse tree produced by mrlangParser#ifstmt.
    def exitIfstmt(self, ctx:mrlangParser.IfstmtContext):
        pass


    # Enter a parse tree produced by mrlangParser#elifstmt.
    def enterElifstmt(self, ctx:mrlangParser.ElifstmtContext):
        pass

    # Exit a parse tree produced by mrlangParser#elifstmt.
    def exitElifstmt(self, ctx:mrlangParser.ElifstmtContext):
        pass


    # Enter a parse tree produced by mrlangParser#elsestmt.
    def enterElsestmt(self, ctx:mrlangParser.ElsestmtContext):
        pass

    # Exit a parse tree produced by mrlangParser#elsestmt.
    def exitElsestmt(self, ctx:mrlangParser.ElsestmtContext):
        pass


    # Enter a parse tree produced by mrlangParser#whilestmt.
    def enterWhilestmt(self, ctx:mrlangParser.WhilestmtContext):
        pass

    # Exit a parse tree produced by mrlangParser#whilestmt.
    def exitWhilestmt(self, ctx:mrlangParser.WhilestmtContext):
        pass


    # Enter a parse tree produced by mrlangParser#forstmt.
    def enterForstmt(self, ctx:mrlangParser.ForstmtContext):
        pass

    # Exit a parse tree produced by mrlangParser#forstmt.
    def exitForstmt(self, ctx:mrlangParser.ForstmtContext):
        pass



del mrlangParser