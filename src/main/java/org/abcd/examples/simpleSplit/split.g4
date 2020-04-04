grammar split;

stat : expr (',' expr)*;

expr :  STR2     # str2
     |  STR1     # str1
     ;


STR2 : ~[,\n\r"]+'('.*? ')';
STR1 : ~[,\n\r"]+;

