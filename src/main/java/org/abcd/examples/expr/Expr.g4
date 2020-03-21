grammar Expr;

//语法以小写字母开头
prog : stat+;

stat: expr NEWLINE          # printExpr
    | ID '=' expr NEWLINE   # assign
    | NEWLINE               # blank
    | CLEAR                 # clear //为计算器新增一个clear功能
    ;
//使用|来分隔一个语言的若干备选分支
//使用()把一些符号组合成子规则
//expr规则在起始位置调用了expr，这称为左递归
expr: expr op=('*'|'/') expr    # MulDiv
| expr op=('+'|'-') expr        # AddSub
| INT                           # int
| ID                            # id
| '(' expr ')'                  # parens
;
//词法以大写字母开头
//词法符号定义的标记和正则表达式的元字符很相似
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
CLEAR: '||';    //当输入||的时候，计算器清空内存
//skip操作告知词法分析器匹配并丢弃空白字符
WS : [ \t]+ -> skip;