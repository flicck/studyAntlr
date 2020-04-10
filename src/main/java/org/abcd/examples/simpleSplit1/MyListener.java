package org.abcd.examples.simpleSplit1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends Split1BaseListener{
    public static Map<String,String> map = new HashMap<>();
    static {
        map.put("省",null);
        map.put("市",null);
        map.put("区",null);
    }

    @Override
    public void exitStr1(Split1Parser.Str1Context ctx) {
        final String text = ctx.STR1().getText();
        map.put("省",text);
        super.exitStr1(ctx);
    }

    @Override
    public void exitStr2(Split1Parser.Str2Context ctx) {
        final String text = ctx.STR2().getText();
        map.put("市",text);
        super.exitStr2(ctx);
    }

    @Override
    public void exitStr3(Split1Parser.Str3Context ctx) {
        final String text = ctx.STR3().getText();
        map.put("区",text);
        super.exitStr3(ctx);
    }
}
