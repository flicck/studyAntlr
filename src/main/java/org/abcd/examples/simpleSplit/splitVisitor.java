// Generated from D:/ideaProject/studyProject/studyAntlr/src/main/java/org/abcd/examples/simpleSplit\split.g4 by ANTLR 4.8
package org.abcd.examples.simpleSplit;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link splitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface splitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link splitParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(splitParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code str2}
	 * labeled alternative in {@link splitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr2(splitParser.Str2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code str1}
	 * labeled alternative in {@link splitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr1(splitParser.Str1Context ctx);
}