package org.abcd.examples.simpleSplit2;



import javafx.util.Pair;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * 自定义任务，将村和组提取出来
 */
public class Start {
    public static void main(String[] args) throws IOException {
        final Pair<String, String> pair1 = getPair("黑龙江省白山市qwe区abc村cd组");
        final Pair<String, String> pair2 = getPair("江西省婺源县");
    }

    /**
     * @param str 字符串
     * @return 第一个是村 第二个是组
     * @throws IOException
     */
    private static Pair<String, String> getPair(String str) throws IOException {
        InputStream in =new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream inputStream = new ANTLRInputStream(in);
        //新建词法分析器，处理输入的charStream
        Split2Lexer lexer = new Split2Lexer(inputStream);
        //新建词法符号的缓冲区
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //新建语法分析器
        Split2Parser parser = new Split2Parser(tokens);
        ParseTree tree = parser.stat();
        final ParseTreeWalker walker = new ParseTreeWalker();
        final MyListener myListener = new MyListener();
        walker.walk(myListener,tree);
        return new Pair<>(myListener.var1,myListener.var2);
    }
}
