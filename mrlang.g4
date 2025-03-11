grammar mrlang;

program: stmt* EOF;
stmt:
	varDecl
	| assignment
	| print
	| ifstmt
	| blockstmt
	| whilestmt
	| forstmt;

expr:
	'(' expr ')'
	| expr aritOperator expr
	| expr compOperator expr
	| MINUS numParsed
	| boolParsed
	| idName
	| numParsed
	| stringParsed;

varDecl: (rawVarDecl | filledVarDecl) ';';
rawVarDecl: typeName idName;
filledVarDecl: typeName idName ASSIGN expr;
typeName: 'int' | 'str' | 'bool';

assignment: rawAssigment ';';
rawAssigment: ID ASSIGN expr;
idName: ID;
numParsed: NUM;
stringParsed: STRING;
boolParsed: BOOL;
aritOperator: PLUS | MINUS | MUL | SLASH;
compOperator:
	LESS
	| LESS_OR_EQUAL
	| EQUAL
	| NOT_EQUAL
	| GREATER
	| GREATER_OR_EQUAL
	| AND
	| OR;

print: 'print' '(' expr ')' ';';
blockstmt: 'begin' (stmt)* 'end';
ifstmt: 'if' '(' expr ')' stmt elifstmt* elsestmt?;
elifstmt: 'elseif' '(' expr ')' stmt;
elsestmt: 'else' stmt;
whilestmt: 'while' '(' expr ')' stmt;
forstmt:
	'for' '(' filledVarDecl ';' expr ';' rawAssigment ')' stmt;

NUM: [0-9]+;
BOOL: ('true' | 'false');
STRING: '"' ~[\r\n]* '"';
MUL: '*';
SLASH: '/';
PLUS: '+';
MINUS: '-';
ASSIGN: '=';
EQUAL: '==';
NOT_EQUAL: '!=';
LESS: '<';
AND: '&&';
OR: '||';
LESS_OR_EQUAL: '<=';
GREATER: '>';
GREATER_OR_EQUAL: '>=';
ID: [a-zA-Z_] [a-zA-Z_0-9]*;

SPACE: [ \r\n\t]+ -> skip;
LINE_COMMENT: '//' ~[\n\r]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;