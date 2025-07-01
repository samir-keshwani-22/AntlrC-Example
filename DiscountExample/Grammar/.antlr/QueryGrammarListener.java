// Generated from d:/AntlrC#Example/DiscountExample/Grammar/QueryGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryGrammarParser}.
 */
public interface QueryGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(QueryGrammarParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(QueryGrammarParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#agg_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterAgg_expr_list(QueryGrammarParser.Agg_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#agg_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitAgg_expr_list(QueryGrammarParser.Agg_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#agg_expr}.
	 * @param ctx the parse tree
	 */
	void enterAgg_expr(QueryGrammarParser.Agg_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#agg_expr}.
	 * @param ctx the parse tree
	 */
	void exitAgg_expr(QueryGrammarParser.Agg_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#time_window}.
	 * @param ctx the parse tree
	 */
	void enterTime_window(QueryGrammarParser.Time_windowContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#time_window}.
	 * @param ctx the parse tree
	 */
	void exitTime_window(QueryGrammarParser.Time_windowContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#where_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhere_expr(QueryGrammarParser.Where_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#where_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhere_expr(QueryGrammarParser.Where_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#account_expr}.
	 * @param ctx the parse tree
	 */
	void enterAccount_expr(QueryGrammarParser.Account_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#account_expr}.
	 * @param ctx the parse tree
	 */
	void exitAccount_expr(QueryGrammarParser.Account_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QueryGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QueryGrammarParser.ExpressionContext ctx);
}