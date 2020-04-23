package org.abcd.examples.simpleSplit2;



import java.util.HashMap;
import java.util.Map;

public class MyListener extends Split2BaseListener{
    public String var1 = null;
    public String var2 = null;

    @Override
    public void exitStr2(Split2Parser.Str2Context ctx) {
        final String text = ctx.STR2().getText();
        var1 = text;
        super.exitStr2(ctx);
    }

    @Override
    public void exitStr3(Split2Parser.Str3Context ctx) {
        final String text = ctx.STR3().getText();
        var2 = text;
        super.exitStr3(ctx);
    }
}
