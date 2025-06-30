grammar DiscountRules;

rules: rule+;
rule: 'if' condition 'then' action;

condition: 'product' 'is' STRING;
action: 'apply' discount;
discount: NUMBER '%' 'discount';

STRING: '"' (~["\r\n])* '"';
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
