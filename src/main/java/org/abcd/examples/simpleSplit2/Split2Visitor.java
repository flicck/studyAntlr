// Generated from D:/ideaProject/openSourceProject/studyAntlr/src/main/java/org/abcd/examples/simpleSplit2\Split2.g4 by ANTLR 4.8
package org.abcd.examples.simpleSplit2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Split2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Split2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Split2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(Split2Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code str1}
	 * labeled alternative in {@link Split2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr1(Split2Parser.Str1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code str2}
	 * labeled alternative in {@link Split2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr2(Split2Parser.Str2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code str3}
	 * labeled alternative in {@link Split2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr3(Split2Parser.Str3Context ctx);
}