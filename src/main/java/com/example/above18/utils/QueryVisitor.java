// Generated from Query.g4 by ANTLR 4.7.2
package com.example.above18.utils;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QueryParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(QueryParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomQuery}
	 * labeled alternative in {@link QueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomQuery(QueryParser.AtomQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priorityQuery}
	 * labeled alternative in {@link QueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityQuery(QueryParser.PriorityQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opQuery}
	 * labeled alternative in {@link QueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpQuery(QueryParser.OpQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteria(QueryParser.CriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(QueryParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QueryParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(QueryParser.OpContext ctx);
}