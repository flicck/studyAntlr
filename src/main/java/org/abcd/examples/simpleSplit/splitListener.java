// Generated from D:/ideaProject/studyProject/studyAntlr/src/main/java/org/abcd/examples/simpleSplit\split.g4 by ANTLR 4.8
package org.abcd.examples.simpleSplit;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link splitParser}.
 */
public interface splitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link splitParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(splitParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link splitParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(splitParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code str2}
	 * labeled alternative in {@link splitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStr2(splitParser.Str2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code str2}
	 * labeled alternative in {@link splitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStr2(splitParser.Str2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code str1}
	 * labeled alternative in {@link splitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStr1(splitParser.Str1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code str1}
	 * labeled alternative in {@link splitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStr1(splitParser.Str1Context ctx);
}