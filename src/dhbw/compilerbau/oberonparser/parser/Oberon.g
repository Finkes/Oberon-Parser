grammar Oberon;

options { 
  language=Java;
  output=AST;
}

@lexer::header  {package dhbw.compilerbau.oberonparser.parser; }
@parser::header {package dhbw.compilerbau.oberonparser.parser; }

/* rules */

number                : INTEGER | REAL;

qualident             : (IDENT '.')? IDENT ;

identdef              : IDENT '*'?;

constantDeclaration   : identdef '=' constExpression;

constExpression       : expression;

typeDeclaration       : identdef '=' type;

type                  : qualident | arrayType | recordType | pointerType | procedureType;

arrayType             : 'ARRAY' length (',' length)* 'OF' type;

length                : constExpression;

recordType            : 'RECORD' ('(' baseType ')')? fieldListSequence 'END';

baseType              : qualident;

fieldListSequence     : fieldList (';' fieldList)*;

fieldList             : (identList ':' type)?;

identList             : identdef (',' identdef)*;

pointerType           : 'POINTER TO' type;

procedureType         : 'PROCEDURE' formalParameters?;

variableDeclaration   : identList ':' type;

designator            : qualident ('.' IDENT | '[' expList ']' | '(' qualident ')' | '^')*;

expList               : expression (',' expression)*;

expression            : simpleExpression (relation simpleExpression)?;

relation              : '=' | '#'|'<'|'<='|'>'|'>='|'IN'|'IS';

simpleExpression      : ('+'|'-')? term (addOperator term)*;

addOperator           : '+' | '-' | 'OR';

term                  : factor (mulOperator factor)*;

mulOperator           : '*'|'/'|'DIV'|'MOD'|'&';

factor                : number | CHARCONST | STRING | 'NIL' | set | designator actualParameters? | '(' expression ')' | '~' factor;

set                   : '{' (element (',' element)* )? '}';

element               : expression ( '..' expression)?;

actualParameters      : '(' expList? ')';

statement             :  (options{backtrack=true;}:assignment|procedureCall|ifStatement|caseStatement|whileStatement|repeatStatement|loopStatement|withStatement| 'EXIT' | 'RETURN' expression? )?;

assignment            : designator ':=' expression;

procedureCall         : designator actualParameters?;

statementSequence     : statement ( ';' statement)*;

ifStatement           : 'IF' expression 'THEN' statementSequence ('ELSEIF' expression 'THEN' statementSequence)* ('ELSE' statementSequence)? 'END';

caseStatement         : 'case' expression 'OF' casE ('|' casE)* ('ELSE' statementSequence)? 'END';

casE                  : (caseLabelList ':' statementSequence)?;

caseLabelList         : caseLabels (',' caseLabels)*;

caseLabels            : constExpression ('..' constExpression);

whileStatement        : 'WHILE' expression 'DO' statementSequence 'END';

repeatStatement       : 'REPEAT' statementSequence 'UNTIL' expression;

loopStatement         : 'LOOP' statementSequence 'END';

withStatement         : 'WITH' qualident ':' qualident 'DO' statementSequence 'END';

procedureDeclaration  : procedureHeading ';' procedureBody IDENT;

procedureHeading      : 'PROCEDURE' '*'? identdef formalParameters?;

procedureBody         : declarationSequence ('BEGIN' statementSequence)? 'END';

forwardDeclaration    : 'PROCEDURE' '^'identdef formalParameters?;

declarationSequence    : ('CONST' (constantDeclaration ';')*  | type ( typeDeclaration ';')* | 'VAR' (variableDeclaration ';')* )* (procedureDeclaration ';' | forwardDeclaration ';')*;

formalParameters      : '(' (fpSection (';' fpSection)*)? ')' (':' qualident)?;

fpSection             : 'VAR'? IDENT (',' IDENT)*  ':' formalType;

formalType            : ('ARRAY OF')* qualident | procedureType;

module                : 'MODULE' IDENT ';' importList? declarationSequence ('BEGIN' statementSequence)? 'END' IDENT '.' EOF;

importList            : 'IMPORT' importDeclaration (',' importDeclaration)* ';' ;

importDeclaration     :  IDENT (':=' IDENT)?;



/* Tokens */

/*
TYPE_LONGINT            : 'LONGINT';

TYPE_BOOLEAN            : 'BOOLEAN';

TYPE_CHAR               : 'CHAR';

TYPE_SHORTINT           : 'SHORTINT';

TYPE_BOOLEAN            : 'BOOLEAN';
*/

IDENT                 : (LETTER)(LETTER|DIGIT)*;

INTEGER               : DIGIT DIGIT* | DIGIT HEX_DIGIT* 'H';

REAL                  : DIGIT DIGIT* '.' DIGIT* SCALE_FACTOR?;

CHARCONST             : '"' CHARACTER '"' | DIGIT HEX_DIGIT* 'X';

STRING                : '"' CHARACTER* '"';

/* skip comments  */
COMMENT               : '/*' (options{greedy=false;}: .)* '*/' {skip();};

fragment DIGIT        : '0'..'9';

fragment HEX_DIGIT    : DIGIT | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

fragment SCALE_FACTOR : ('E' | 'D') ('+' | '-')? DIGIT DIGIT*;

fragment LETTER       : 'a'..'z'|'A'..'Z';

fragment CHARACTER    : LETTER|'!'|'?'|'.'|','; //TODO add more special characters


/* Ignore WS */
WS                    :   (' ' | '\t' | '\r'| '\n')+ {$channel=HIDDEN;};


