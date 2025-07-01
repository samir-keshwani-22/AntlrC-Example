grammar PseudoQueryExpression;

start
    : query EOF
    ;

query
    : expression
    | aggregateQuery
    ;

aggregateQuery
    : 'QUERY' aggregateList 'FROM' 'DATA' timeFilter? whereClause?
    ;

aggregateList
    : aggregate (',' aggregate)*
    ;

aggregate
    : ('COUNT' | 'SUM') '(' (VALUEIDENTIFIER | STAR) ')'
    ;

STAR: '*';

timeFilter
    : 'PAST' INT 'day' 'FROM' timeReference
    ;

timeReference
    : 'transaction date'
    | INT 'hour' 'before' 'transaction date'
    ;

whereClause
    : 'WHERE' preExpression? expression
    ;

preExpression
    : IDENTIFIER 'is' ('{source}' | '{dest}') 'AND'
    ;

expression
    : term (logical_operator term)*
    ;

term
    : '(' expression ')'
    | field operator value
    ;

field
    : IDENTIFIER
    ;

operator
    : '=' | '!=' | '>' | '<' | '>=' | '<=' | 'in' | 'not in'
    ;

value
    : VALUEIDENTIFIER
    | DATE
    | EMPTY
    ;

logical_operator
    : 'AND'
    | 'OR'
    ;

DATE
    : '{' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '}'
    ;

fragment DIGIT : [0-9];

IDENTIFIER
    : '#{' [a-zA-Z_][a-zA-Z0-9_,.]* '}'
    ;

fragment VALUECHAR : ~[{}];

VALUEIDENTIFIER
    : '{' VALUECHAR+ '}'
    ;

EMPTY
    : '{' WS* '}'
    ;

INT
    : [0-9]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
 