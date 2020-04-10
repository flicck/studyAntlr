// Generated from D:/ideaProject/openSourceProject/studyAntlr/src/main/java/org/abcd/examples/simpleSplit1\Split1.g4 by ANTLR 4.8
package org.abcd.examples.simpleSplit1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Split1Parser}.
 */
public interface Split1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Split1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Split1Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Split1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Split1Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code str1}
	 * labeled alternative in {@link Split1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStr1(Split1Parser.Str1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code str1}
	 * labeled alternative in {@link Split1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStr1(Split1Parser.Str1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code str2}
	 * labeled alternative in {@link Split1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStr2(Split1Parser.Str2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code str2}
	 * labeled alternative in {@link Split1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStr2(Split1Parser.Str2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code str3}
	 * labeled alternative in {@link Split1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStr3(Split1Parser.Str3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code str3}
	 * labeled alternative in {@link Split1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStr3(Split1Parser.Str3Context ctx);
}