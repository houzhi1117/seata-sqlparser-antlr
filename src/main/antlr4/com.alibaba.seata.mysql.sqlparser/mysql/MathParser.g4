grammar MathParser;

prog: stat+;

stat: expr NEWLINE             # printExpr
         |ID '=' expr NEWLINE  # assign
         |NEWLINE              # blank
         ;
// 语法规则
expr
    : expr op=('*'|'/') expr        # MulDiv
    | expr op=('+'|'-') expr        # AddSub
    | INT                           # int
    | ID                            # id
    | '(' expr ')'                  # parens
    ;

// 词法规则
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ID : [a-zA-Z]+ ; // matchidentifiers
INT : [0-9]+ ; // match integers
NEWLINE:'\r'? '\n' ;//return newlinesto parser(end-statement signal)
WS : [ \t]+ -> skip ;// skip space and tab
