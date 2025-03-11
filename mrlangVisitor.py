# Generated from mrlang.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .mrlangParser import mrlangParser
else:
    from mrlangParser import mrlangParser

# This class defines a complete generic visitor for a parse tree produced by mrlangParser.

class mrlangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by mrlangParser#program.
    def visitProgram(self, ctx:mrlangParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#stmt.
    def visitStmt(self, ctx:mrlangParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#expr.
    def visitExpr(self, ctx:mrlangParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#varDecl.
    def visitVarDecl(self, ctx:mrlangParser.VarDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#rawVarDecl.
    def visitRawVarDecl(self, ctx:mrlangParser.RawVarDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#filledVarDecl.
    def visitFilledVarDecl(self, ctx:mrlangParser.FilledVarDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#typeName.
    def visitTypeName(self, ctx:mrlangParser.TypeNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#assignment.
    def visitAssignment(self, ctx:mrlangParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#rawAssigment.
    def visitRawAssigment(self, ctx:mrlangParser.RawAssigmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#idName.
    def visitIdName(self, ctx:mrlangParser.IdNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#numParsed.
    def visitNumParsed(self, ctx:mrlangParser.NumParsedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#stringParsed.
    def visitStringParsed(self, ctx:mrlangParser.StringParsedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#boolParsed.
    def visitBoolParsed(self, ctx:mrlangParser.BoolParsedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#aritOperator.
    def visitAritOperator(self, ctx:mrlangParser.AritOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#compOperator.
    def visitCompOperator(self, ctx:mrlangParser.CompOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#print.
    def visitPrint(self, ctx:mrlangParser.PrintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#blockstmt.
    def visitBlockstmt(self, ctx:mrlangParser.BlockstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#ifstmt.
    def visitIfstmt(self, ctx:mrlangParser.IfstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#elifstmt.
    def visitElifstmt(self, ctx:mrlangParser.ElifstmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#elsestmt.
    def visitElsestmt(self, ctx:mrlangParser.ElsestmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#whilestmt.
    def visitWhilestmt(self, ctx:mrlangParser.WhilestmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mrlangParser#forstmt.
    def visitForstmt(self, ctx:mrlangParser.ForstmtContext):
        return self.visitChildren(ctx)



del mrlangParser