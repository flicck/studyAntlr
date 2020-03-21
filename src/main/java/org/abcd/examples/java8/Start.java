package org.abcd.examples.java8;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

/**
 * 对应antlr4权威指南第四章 --提取java类的接口
 * 课本上的例子过于简单，这里使用全量java8的g4文件对接口进行提取
 * 该文件是在 https://github.com/antlr/grammars-v4下载
 * 相关说明已经注释到Java8Parser.g4文件中
 *  @anthor flicck
 */
public class Start {
    public static void main(String[] args) throws IOException {

        //这里替换成你项目下的Demo的路径
        final FileReader fileReader = new FileReader("D:\\ideaProject\\studyProject\\studyAntlr\\src\\main\\java\\org\\abcd\\examples\\java8\\useExamples\\Demo.java");
        ANTLRInputStream inputStream = new ANTLRInputStream(fileReader);
        //新建词法分析器，处理输入的charStream
        Java8Lexer lexer = new Java8Lexer(inputStream);
        //新建词法符号的缓冲区
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //新建语法分析器
        final Java8Parser parser = new Java8Parser(tokens);
        //开始语法分析
        final Java8Parser.CompilationUnitContext tree = parser.compilationUnit();
        final ParseTreeWalker walker = new ParseTreeWalker();
        final MyListener myListener = new MyListener(parser);
        walker.walk(myListener,tree);

//        System.out.println(tree.toStringTree(parser));

//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk();
//        System.out.println(tree.toStringTree(parser));
    }
}
