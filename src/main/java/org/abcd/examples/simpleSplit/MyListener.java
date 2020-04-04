package org.abcd.examples.simpleSplit;

import java.util.ArrayList;
import java.util.List;

public class MyListener extends splitBaseListener {
    public static List<String> list = new ArrayList<String>();
    @Override
    public void exitStr1(splitParser.Str1Context ctx) {

        final String text = ctx.STR1().getText();
        list.add(text);
        super.exitStr1(ctx);
    }


    @Override
    public void exitStr2(splitParser.Str2Context ctx) {
        final String text = ctx.STR2().getText();
        list.add(text);
        super.exitStr2(ctx);
    }
}
