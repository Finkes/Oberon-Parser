grammar Oberon;

options { 
  language=Java;
  output=AST;
}

tokens{ASSIGN;}

@lexer::header  {package dhbw.compilerbau.oberonparser.parser; }
@parser::header {package dhbw.compilerbau.oberonparser.parser; }



/* rules */

number                : INTEGER | REAL;

identdef              : IDENT '*'?;

constantDeclaration   : identdef '=' constExpression      -> ^( '=' identdef constExpression);

constExpression       : expression;

typeDeclaration       : identdef '=' type                 -> ^( '=' identdef type);

type                  : qualident | arrayType | recordType | pointerType | procedureType;

arrayType             : 'ARRAY' length (',' length)* 'OF' type;

length                : constExpression;

recordType            : 'RECORD' ('(' baseType ')')? fieldListSequence 'END';

baseType              : qualident;

fieldListSequence     : fieldList (';' fieldList)*;

fieldList             : (identList ':' type)?;

identList             : identdef (',' identdef)*;

pointerType           : 'POINTER TO'^ type;

procedureType         : 'PROCEDURE' formalParameters?;

variableDeclaration   : identList ':' type;

qualident             : (options{ greedy=true;}:IDENT '.')? IDENT ;

designator            : qualident ('.' IDENT | '[' expList ']' | '(' qualident ')' | '^')*;

expList               : expression (',' expression)*;

expression            : simpleExpression (relation^ simpleExpression)?;// -> ^(simpleExpression (relation simpleExpression)?);

relation              : '=' | '#'|'<'|'<='|'>'|'>='|'IN'|'IS';

simpleExpression      : ('+'|'-')? term (addOperator term)*;

addOperator           : '+' | '-' | 'OR';

term                  : factor (mulOperator factor)*;

mulOperator           : '*'|'/'|'DIV'|'MOD'|'&';

factor                : number | CHARCONST | STRING | 'NIL' | set | designator actualParameters? | '(' expression ')' | '~' factor;

set                   : '{' (element (',' element)* )? '}';

element               : expression ( '..' expression)?;

actualParameters      : '(' expList? ')';

statement             :  (statement2|ifStatement|caseStatement|whileStatement|repeatStatement|loopStatement|withStatement| 'EXIT' | 'RETURN' expression? )?;

statement2            : aaaa=designator ( aaaa=assignment | b=procedureCall ); //->  {$aaaa == null}? ^(ASSIGN designator assignment) -> ^(ASSIGN designator procedureCall) ;

assignment            :  ':=' expression -> ^(ASSIGN  ':=' expression);

procedureCall         :  actualParameters?;

statementSequence     : statement ( ';' statement)* -> ^(statement ( statement)*);

ifStatement           : 'IF' expression 'THEN' statementSequence ('ELSIF' expression 'THEN' statementSequence)* ('ELSE' statementSequence)? 'END';// ->^('IF' expression 'THEN' statementSequence ('ELSIF' expression 'THEN' statementSequence)* ('ELSE' statementSequence)? 'END');

caseStatement         : 'case' expression 'OF' casE ('|' casE)* ('ELSE' statementSequence)? 'END' -> ^('case' expression 'OF' casE ('|' casE)* ('ELSE' statementSequence)? 'END');

casE                  : (caseLabelList ':' statementSequence)?;

caseLabelList         : caseLabels (',' caseLabels)*;

caseLabels            : constExpression ('..' constExpression);

whileStatement        : 'WHILE'^ expression 'DO'! statementSequence 'END'!;

repeatStatement       : 'REPEAT'^ statementSequence 'UNTIL'! expression;

loopStatement         : 'LOOP'^ statementSequence 'END'!;

withStatement         : 'WITH'^ qualident ':' qualident 'DO'! statementSequence 'END'!;

procedureDeclaration  : procedureHeading ';' procedureBody IDENT                -> ^(procedureHeading  procedureBody IDENT);

procedureHeading      : 'PROCEDURE'^ '*'? identdef formalParameters?;

procedureBody         : declarationSequence ('BEGIN' statementSequence)? 'END'  ;// -> ^(declarationSequence ( statementSequence)? );

forwardDeclaration    : 'PROCEDURE' '^' identdef formalParameters?;

declarationSequence    : (constdeclarationSequence | typedeclarationSequence |vardeclarationSequence  )* (procedureDeclaration ';'! | forwardDeclaration ';')*;

constdeclarationSequence : 'CONST' (constantDeclaration ';')*     ;//  -> ^('CONST' (constantDeclaration ';')*);

typedeclarationSequence : 'TYPE' ( typeDeclaration ';')*          ;//  -> ^('TYPE' ( typeDeclaration ';')*);

vardeclarationSequence :  'VAR' (variableDeclaration ';')*        ;//  -> ^('VAR' (variableDeclaration ';')*);


formalParameters      : '(' (fpSection (';' fpSection)*)? ')' (':' qualident)?;

fpSection             : 'VAR'? IDENT (',' IDENT)*  ':' formalType;

formalType            : ('ARRAY' 'OF')* qualident | procedureType;

module                : 'MODULE'^ IDENT ';'! importList? declarationSequence ('BEGIN' statementSequence)? 'END' IDENT '.'! EOF;

importList            : 'IMPORT' importDeclaration (',' importDeclaration)* ';'     -> ^('IMPORT' importDeclaration ( importDeclaration)* ) ;

importDeclaration     :  IDENT (':=' IDENT)?                                        -> ^(IDENT (':=' IDENT)?);



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

fragment CHARACTER    : LETTER|'!'|'?'|'.'|','|DIGIT; //TODO add more special characters


/* Ignore WS */
WS                    :   (' ' | '\t' | '\r'| '\n')+ {$channel=HIDDEN;};


