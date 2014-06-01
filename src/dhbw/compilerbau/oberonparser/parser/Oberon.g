grammar Oberon;

options { 
  language=Java;
  output=AST;
}

tokens{ASSIGN;DECLARE;BLOCK;PROCEDURE_BODY;FORMAL_PARAMETERS;PROCEDURE;TYPE_DECL;ID;}

@lexer::header  {package dhbw.compilerbau.oberonparser.parser; }
@parser::header {package dhbw.compilerbau.oberonparser.parser; }


/* predefined PROCEDURES */
abs                   : 'ABS'^ '('! number ')'!;
odd                   : 'ODD'^ '('! INTEGER ')'!;                
cap                   : 'CAP'^ '('! CHARACTER ')'!;
ash                   : 'ASH'^ '('! INTEGER ')'!;
len                   : 'LEN'^ '('! qualident (',' INTEGER)? ')'!;
maxMin                : ('MAX'^|'MIN'^) '('! qualident|set ')'!;
//min                   : 'MIN' '(' qualident|set ')';
size                  : 'SIZE'^ '('! qualident ')'!;

inc                   : 'INC'^ '('! INTEGER (','! INTEGER)? ')'!;
dec                   : 'DEC'^ '('! INTEGER (','! INTEGER)? ')'!;
incl                  : 'INCL'^ '('! set ','! INTEGER ')'!;
excl                  : 'EXCL'^ '('! set ','! INTEGER ')'!;
copy                  : 'COPY'^ '('! qualident ','! qualident ')'!;
neW                   : 'NEW'^ '('! qualident ')'! ;
halt                  : 'HALT'^ '('! INTEGER ')'!;

predefined            : (abs|odd|cap|ash|len|maxMin|size|inc|dec|incl|excl|copy|neW|halt);

/* rules */

number                : INTEGER | REAL;

identdef              : IDENT '*'?;

constantDeclaration   : identdef '=' constExpression      -> ^( '=' identdef constExpression);

constExpression       : expression;

typeDeclaration       : identdef '=' type                 -> ^( TYPE_DECL identdef type);

type                  : qualident | arrayType | recordType | pointerType | procedureType;

arrayType             : 'ARRAY' length (',' length)* 'OF' type;

length                : constExpression;

recordType            : 'RECORD' ('(' baseType ')')? fieldListSequence 'END' -> ^('RECORD' baseType? fieldListSequence);

baseType              : qualident;

fieldListSequence     : fieldList (';'! fieldList)* ;

fieldList             : (identList ':'^ type)?;

identList             : identdef (',' identdef)*;

pointerType           : 'POINTER TO'^ type;

procedureType         : 'PROCEDURE'^ formalParameters?;

variableDeclaration   : identList ':' type -> ^(DECLARE identList type);

qualident             : (options{ greedy=true;}:IDENT '.')? IDENT -> ^(ID IDENT*);

designator            : qualident (options{ greedy=true;}:'.' IDENT | '['! expList ']'! | '('! qualident ')'! | '^')*;

expList               : expression (',' expression)*;

expression            : simpleExpression (relation^ simpleExpression)?;// -> ^(simpleExpression (relation simpleExpression)?);

relation              : '=' | '#'|'<'|'<='|'>'|'>='|'IN'|'IS';

simpleExpression      : ('+'|'-')? term (addOperator^ term)*;

addOperator           : '+' | '-' | 'OR';

term                  : factor (mulOperator^ factor)*;

mulOperator           : '*'|'/'|'DIV'|'MOD'|'&';

factor                : number | CHARCONST | STRING | 'NIL' | set | designator actualParameters? | '('! expression^ ')'! | '~' factor;

set                   : '{' (element (',' element)* )? '}';

element               : expression ( '..' expression)?;

actualParameters      : '('! expList? ')'!;

statement             :  (predefined|statement2|ifStatement|caseStatement|whileStatement|repeatStatement|loopStatement|withStatement| 'EXIT' | 'RETURN' expression? )?;

statement2            : designator  ((':=' expression) | procedureCall) -> ^(ASSIGN designator expression? procedureCall?) ; //-> ^(assignment?  procedureCall?); //->  {$aaaa == null}? ^(ASSIGN designator assignment) -> ^(ASSIGN designator procedureCall) ;

procedureCall         :  actualParameters?;

statementSequence     : statement ( ';' statement)*  -> ^(BLOCK statement ( statement)*);

ifStatement           : 'IF' expression 'THEN' s1=statementSequence ('ELSIF' expression 'THEN' s2=statementSequence)* ('ELSE' s3=statementSequence)? 'END' 
                      -> ^('IF' expression? $s1? ^('ELSIF' expression?  $s2?)* ('ELSE' $s3?)?   );

caseStatement         : 'case' expression 'OF' casE ('|' casE)* ('ELSE' statementSequence)? 'END' 
                      -> ^('case' expression 'OF' casE ('|' casE)* ('ELSE' statementSequence)? 'END');

casE                  : (caseLabelList ':' statementSequence)?;

caseLabelList         : caseLabels (',' caseLabels)*;

caseLabels            : constExpression ('..' constExpression);

whileStatement        : 'WHILE' expression 'DO' statementSequence 'END' -> ^('WHILE' expression statementSequence);

repeatStatement       : 'REPEAT'^ statementSequence 'UNTIL'! expression;

loopStatement         : 'LOOP'^ statementSequence 'END'!;

withStatement         : 'WITH'^ qualident ':' qualident 'DO'! statementSequence 'END'!;

procedureDeclaration  : procedureHeading ';' procedureBody IDENT                -> ^(PROCEDURE procedureHeading  procedureBody );

procedureHeading      : 'PROCEDURE' '*'? identdef formalParameters? -> identdef formalParameters?;

procedureBody         : declarationSequence ('BEGIN' statementSequence)? 'END'   -> ^(PROCEDURE_BODY declarationSequence?  statementSequence? );

forwardDeclaration    : 'PROCEDURE' '^' identdef formalParameters?;

declarationSequence    : (constdeclarationSequence | typedeclarationSequence |vardeclarationSequence  )* (procedureDeclaration ';'! | forwardDeclaration ';')*;

constdeclarationSequence : 'CONST' (constantDeclaration ';')*       -> ^('CONST' (constantDeclaration )*);

typedeclarationSequence : 'TYPE' ( typeDeclaration ';')*            -> ^('TYPE' ( typeDeclaration )*);

vardeclarationSequence :  'VAR' (variableDeclaration ';')*          -> ^('VAR' (variableDeclaration )*);


formalParameters      : '(' (fpSection (';' fpSection)*)? ')' (':' qualident)? -> ^(FORMAL_PARAMETERS fpSection* qualident?);

fpSection             : 'VAR'? IDENT (',' IDENT)*  ':' formalType;

formalType            : ('ARRAY'^ 'OF'!)* qualident | procedureType;

module                : 'MODULE'^ IDENT ';'! importList? declarationSequence ('BEGIN'! statementSequence)? 'END'! IDENT! '.'! EOF!;

importList            : 'IMPORT' importDeclaration (',' importDeclaration)* ';'     -> ^('IMPORT' importDeclaration ( importDeclaration)* ) ;

importDeclaration     :  IDENT (':=' IDENT)?                                        -> ^( ':=' IDENT ( IDENT)?);




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
COMMENT               : '(*' (options{greedy=false;}: .)* '*)' {skip();};

fragment DIGIT        : '0'..'9';

fragment HEX_DIGIT    : DIGIT | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

fragment SCALE_FACTOR : ('E' | 'D') ('+' | '-')? DIGIT DIGIT*;

fragment LETTER       : 'a'..'z'|'A'..'Z';

fragment CHARACTER    : LETTER|'!'|'?'|'.'|','|DIGIT; //TODO add more special characters


/* Ignore WS */
WS                    :   (' ' | '\t' | '\r'| '\n')+ {$channel=HIDDEN;};


