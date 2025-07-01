grammar QueryGrammar;

query:
	QUERY agg_expr_list FROM DATA (time_related)? (
		WHERE where_expr
	)?;

agg_expr_list: agg_expr (',' agg_expr)*;

agg_expr:
	COUNT LPAREN (STAR | AMOUNT) RPAREN
	| SUM LPAREN AMOUNT RPAREN;

time_related: PAST INT DAY FROM (offset)? TRANSACTION_DATE;

offset: INT HOUR BEFORE;

where_expr: account_expr (AND where_expr)? | expression;

account_expr: ACCOUNT IS SOURCE | ACCOUNT IS DEST;

expression: 'expression';

QUERY: 'QUERY';
COUNT: 'COUNT';
SUM: 'SUM';
STAR: '*';
AMOUNT: '{amount}';
LPAREN: '(';
RPAREN: ')';
WHERE: 'WHERE';
ACCOUNT: '#{account}';
SOURCE: '{source}';
DEST: '{dest}';
IS: 'is';
AND: 'AND';
FROM: 'FROM';
DATA: 'DATA';
PAST: 'PAST';
DAY: 'day';
HOUR: 'hour';
BEFORE: 'before';
TRANSACTION_DATE: 'transaction date';
INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;