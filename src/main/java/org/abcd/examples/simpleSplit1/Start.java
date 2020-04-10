package org.abcd.examples.simpleSplit1;



import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**自定义任务，将xx省xx市xx县(区)拆分成 xx省, xx市, xx县(区)
 * 即使其中省、市、县有缺失仍能够正确拆分
 */
public class Start {
    public static void main(String[] args) throws IOException {
        String str ="江西省上饶市婺源县";
        InputStream in =new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream inputStream = new ANTLRInputStream(in);
        //新建词法分析器，处理输入的charStream
        Split1Lexer lexer = new Split1Lexer(inputStream);
        //新建词法符号的缓冲区
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //新建语法分析器
        Split1Parser parser = new Split1Parser(tokens);
        ParseTree tree = parser.stat();
        final ParseTreeWalker walker = new ParseTreeWalker();
        final MyListener myListener = new MyListener();
        walker.walk(myListener,tree);
        final Map<String, String> map = MyListener.map;
        System.out.println(map);
    }
}
