grammar Expr;

expr
    : expr op=MUL expr      # MulDiv
    | expr op=DIV expr      # MulDiv
    | expr op=PLUS expr     # AddSub
    | expr op=MINUS expr    # AddSub
    | NUMBER               # Number
    | '(' expr ')'         # Parens
    ;

MUL : '*' ;
DIV : '/' ;
PLUS : '+' ;
MINUS : '-' ;

// Match decimal or integer
NUMBER : [0-9]+ ('.' [0-9]+)? ;

WS : [ \t\r\n]+ -> skip ;