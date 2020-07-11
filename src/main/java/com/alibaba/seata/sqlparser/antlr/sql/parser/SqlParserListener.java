// Generated from F:/seata/git-seata/seata-sqlparser-antlr/src/main/antlr4/com.alibaba.seata.mysql.sqlparser/mysql\SqlParser.g4 by ANTLR 4.8
package com.alibaba.seata.sqlparser.antlr.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParserParser}.
 */
public interface SqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParserParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SqlParserParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParserParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SqlParserParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParserParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqlParserParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParserParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqlParserParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParserParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(SqlParserParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParserParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(SqlParserParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParserParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SqlParserParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParserParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SqlParserParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParserParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(SqlParserParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParserParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(SqlParserParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SqlParserParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(SqlParserParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SqlParserParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(SqlParserParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParserParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(SqlParserParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParserParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(SqlParserParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParserParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(SqlParserParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParserParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(SqlParserParser.FullColumnNameContext ctx);
}