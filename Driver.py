import sys
from antlr4 import *
from mrlangLexer import mrlangLexer
from mrlangParser import mrlangParser
from VisitorInterpret import VisitorInterpret
from VisitorCompile import VisitorCompile

def main(argv):
    input_stream = FileStream(argv[1])
    output_stream = open(argv[2], 'w')
    # input_stream = FileStream("example.mr")
    lexer = mrlangLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = mrlangParser(stream)
    tree = parser.program()
    if parser.getNumberOfSyntaxErrors() > 0:
        print("syntax errors")
    else:
        vinterp = VisitorInterpret()
        #vinterp = VisitorCompile()
        print(vinterp.visit(tree), file=output_stream)

if __name__ == '__main__':
    main(sys.argv)