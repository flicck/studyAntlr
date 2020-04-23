
grammar Split2;
//指定 maven生成的类的位置，那么就可以编写类通过反射来执行了，不需要先自己生成
//注意如果还要手动生成，antlr4的maven插件就得注释掉，不然会报类重复
//@header{
//    package org.abcd.examples.simpleSplit1;
//}

stat : expr*;

expr :  STR1     # str1
     |  STR2     # str2
     |  STR3     # str3
     ;


STR1 : ~[,\n\r"]+ [省市区县镇乡];
STR2 : ~[,\n\r省市区县镇乡"] + '村';
STR3 : ~[,\n\r省市区县镇乡村"] + '组';