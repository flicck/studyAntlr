package org.abcd.examples.java8;

/**
 * 对应antlr4权威指南第四章 --提取java类的接口
 * 课本上的例子过于简单，这里使用全量java8的g4文件对接口进行提取
 * 该文件是在 https://github.com/antlr/grammars-v4下载
 * 相关说明已经注释到Java8Parser.g4文件中
 * @anthor flicck
 */
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings("all")
public class MyListener extends Java8ParserBaseListener{
    Java8Parser parser;
    public MyListener(Java8Parser parser){
        this.parser = parser;
    }
    /** 监听对类的定义的匹配 */
    @Override
    public void enterClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
        System.out.println("interface I"+ctx.normalClassDeclaration().Identifier()+" {");
    }
    @Override
    public void exitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
        System.out.println("}");
    }

   /** 监听对方法定义的匹配 */
   /** 这里我们之间对MethodDeclaration监听方便大家理解，其实也可以更细粒度的对MethodDeclarator
    * 或formalParameters进行监听，代码会更加简洁，可以尝试一下*/
    @Override
    public void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
        /** 获取返回值 */
        //需要从语法分析器中获取词法符号
        TokenStream tokens = parser.getTokenStream();
        //定义默认的返回值
        String type = "void";
        final Java8Parser.MethodHeaderContext head = ctx.methodHeader();
        //获得实际的返回值Context
        final Java8Parser.ResultContext result = head.result();
        //如果这个返回值不为null，那么将获得其对用的token的文本
        if (result != null) {
            type = tokens.getText(result);
        }
        //好了 以上为止 我们拿到了返回值
        /** 获取方法名*/
        //declarator中可以获得方法名和参数
        final Java8Parser.MethodDeclaratorContext declarator = head.methodDeclarator();
        final TerminalNode identifier = declarator.Identifier();
        final String methodName = identifier.getText();
        //好了 以上为止 我们拿到了方法名
        /** 获取参数 */
        String paramsStr = "";
        final Java8Parser.FormalParameterListContext formalParameterListContext = declarator.formalParameterList();
        if (formalParameterListContext != null) {
            final Java8Parser.FormalParametersContext formalParametersContext = formalParameterListContext.formalParameters();
            final List<Java8Parser.FormalParameterContext> formalParameterContexts = formalParametersContext.formalParameter();
            //遍历formalParameterContexts集合 获得除了最后一个参数的参数类型和参数名
            for (Java8Parser.FormalParameterContext x : formalParameterContexts) {
                final Java8Parser.UnannTypeContext unannTypeContext = x.unannType();
                //paramType是真正的参数类型
                final String paramType = tokens.getText(unannTypeContext);
                paramsStr = paramsStr + paramType + " ";
                final Java8Parser.VariableDeclaratorIdContext variableDeclaratorIdContext = x.variableDeclaratorId();
                final TerminalNode identifier1 = variableDeclaratorIdContext.Identifier();
                //paramName是真正的参数名
                final String paramName = identifier1.getText();
                paramsStr = paramsStr + paramName + ",";
            }
            if (!paramsStr.equals("")) {
                paramsStr = paramsStr.substring(0, paramsStr.length() - 1);
            }
            //让我们再来获取最后一个参数
            final Java8Parser.LastFormalParameterContext lastFormalParameterContext = formalParameterListContext.lastFormalParameter();
            final Java8Parser.FormalParameterContext formalParameterContext = lastFormalParameterContext.formalParameter();
            final Java8Parser.VariableDeclaratorIdContext variableDeclaratorIdContext = formalParameterContext.variableDeclaratorId();
            final String lastParaName = variableDeclaratorIdContext.Identifier().getText();
            final Java8Parser.UnannTypeContext unannTypeContext = formalParameterContext.unannType();
            final String lastParaType = tokens.getText(unannTypeContext);
            paramsStr = paramsStr + "," + lastParaType + " " + lastParaName;
         }
        //输出结果吧
        System.out.println("\t"+type+" "+methodName+" ("+paramsStr+");");
    }
}
