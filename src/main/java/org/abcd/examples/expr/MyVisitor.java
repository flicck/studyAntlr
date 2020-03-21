package org.abcd.examples.expr;


import java.util.HashMap;
import java.util.Map;
/**
 * 对应antlr4权威指南第三章 --建立一个简单的计算器
 * 已增加clear内存清理功能
 * @anthor flicck
 */
public class MyVisitor extends ExprBaseVisitor<Integer> {
    /** 计算器的内存，存放变量名和变量值的映射关系*/
    Map<String,Integer> memory = new HashMap<>();
    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(ExprParser.AssignContext ctx) {
        final String id = ctx.ID().getText();
        final Integer value  = visit(ctx.expr());
        memory.put(id,value);
        return value;
    }
    /** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(ExprParser.PrintExprContext ctx) {
        //计算表达式的值
        final Integer value = visit(ctx.expr());
        //输出结果并归0
        System.out.println(value);
        return 0;
    }
    /** CLEAR */
    @Override
    public Integer visitClear(ExprParser.ClearContext ctx) {
        //清空计算器内存
        memory.clear();
        return 0;
    }

    /** INT */
    @Override
    public Integer visitInt(ExprParser.IntContext ctx) {
        //将文本转换成可以计算的值
        final Integer var1 = Integer.valueOf(ctx.INT().getText());
        return var1;
    }
    /** ID */
    @Override
    public Integer visitId(ExprParser.IdContext ctx) {
        final String id = ctx.ID().getText();
        //如果内存中已经有这个变量的值了，就取出来返回
        if(memory.containsKey(id)) return memory.get(id);
        //否则给予这个变量默认值0
        return 0;
    }
    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(ExprParser.MulDivContext ctx) {
        //计算左侧的值
        final Integer left = visit(ctx.expr(0));
        //计算右侧的值
        final Integer right = visit(ctx.expr(1));
        //匹配运算符
        if(ctx.op.getType()==ExprParser.MUL){
            return left*right;
        }
        return left/right;
    }
    /** expr op=('+'|'-') expr */
    @Override
    public Integer visitAddSub(ExprParser.AddSubContext ctx) {
        final Integer left = visit(ctx.expr(0));
        final Integer right = visit(ctx.expr(1));
        if(ctx.op.getType()==ExprParser.ADD){
            return left+right;
        }
        return left-right;
    }
    /**'(' expr ')' */
    @Override
    public Integer visitParens(ExprParser.ParensContext ctx) {
        //返回括号中的运算的值即可
        return visit(ctx.expr());
    }

}
