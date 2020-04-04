package org.abcd.examples.simpleSplit;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.List;

/**自定义任务，将ab,cd,ad(ef,gf),de拆分成ab, cd, ad(ef,gf),de ,括号里的不拆分
 */
public class Start {
    public static void main(String[] args) throws IOException {
        String str ="ab,cd,ad(ef,gf),de";
        ANTLRInputStream inputStream = new ANTLRInputStream(str);
        //新建词法分析器，处理输入的charStream
        splitLexer lexer = new splitLexer(inputStream);
        //新建词法符号的缓冲区
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //新建语法分析器
        splitParser parser = new splitParser(tokens);
        ParseTree tree = parser.stat();
        final ParseTreeWalker walker = new ParseTreeWalker();
        final MyListener myListener = new MyListener();
        walker.walk(myListener,tree);
        final List<String> list = MyListener.list;
        System.out.println(list);
        System.out.println(list.size());
    }
}
