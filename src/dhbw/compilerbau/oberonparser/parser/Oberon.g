grammar Oberon;

options { 
  language=Java;
  output=AST;
}

@lexer::header  {package dhbw.compilerbau.oberonparser.parser; }
@parser::header {package dhbw.compilerbau.oberonparser.parser; }


program               : 'MODULE' ID ';' importDeclarations block ID '.' EOF;

importDeclarations    : importDeclaration*;

importDeclaration     : 'IMPORT' ID ';';

block                 : 'BEGIN' 'END';

/* Identifier Token*/
ID : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;

/* Ignore WS */
WS  :   (' ' | '\t' | '\r'| '\n')+ {$channel=HIDDEN;};


