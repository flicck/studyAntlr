// Generated from D:/ideaProject/openSourceProject/studyAntlr/src/main/java/org/abcd/examples/simpleSplit2\Split2.g4 by ANTLR 4.8
package org.abcd.examples.simpleSplit2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Split2Parser}.
 */
public interface Split2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Split2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Split2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Split2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Split2Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code str1}
	 * labeled alternative in {@link Split2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStr1(Split2Parser.Str1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code str1}
	 * labeled alternative in {@link Split2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStr1(Split2Parser.Str1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code str2}
	 * labeled alternative in {@link Split2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStr2(Split2Parser.Str2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code str2}
	 * labeled alternative in {@link Split2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStr2(Split2Parser.Str2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code str3}
	 * labeled alternative in {@link Split2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStr3(Split2Parser.Str3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code str3}
	 * labeled alternative in {@link Split2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStr3(Split2Parser.Str3Context ctx);
}