// Generated from Query.g4 by ANTLR 4.7.2
package com.example.above18.utils;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParser}.
 */
public interface QueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(QueryParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(QueryParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomQuery}
	 * labeled alternative in {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterAtomQuery(QueryParser.AtomQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomQuery}
	 * labeled alternative in {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitAtomQuery(QueryParser.AtomQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorityQuery}
	 * labeled alternative in {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterPriorityQuery(QueryParser.PriorityQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorityQuery}
	 * labeled alternative in {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitPriorityQuery(QueryParser.PriorityQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opQuery}
	 * labeled alternative in {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterOpQuery(QueryParser.OpQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opQuery}
	 * labeled alternative in {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitOpQuery(QueryParser.OpQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterCriteria(QueryParser.CriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitCriteria(QueryParser.CriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(QueryParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(QueryParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(QueryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(QueryParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(QueryParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(QueryParser.OpContext ctx);
}