package org.abcd.examples.expr;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * 对应antlr4权威指南第三章 已增加clear内存清理功能
 * @anthor flicck
 */
public class Start {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
        //新建词法分析器，处理输入的charStream
        ExprLexer lexer = new ExprLexer(inputStream);
        //新建词法符号的缓冲区
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //新建语法分析器
        ExprParser parser = new ExprParser( tokens);
        ParseTree tree = parser.prog();
        final MyVisitor myVisitor = new MyVisitor();
        myVisitor.visit(tree);

//        System.out.println(tree.toStringTree(parser));

//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk();
//        System.out.println(tree.toStringTree(parser));
    }
}
