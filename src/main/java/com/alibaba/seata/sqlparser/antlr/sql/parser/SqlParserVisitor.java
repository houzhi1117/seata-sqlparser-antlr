// Generated from F:/seata/git-seata/seata-sqlparser-antlr/src/main/antlr4/com.alibaba.seata.mysql.sqlparser/mysql\SqlParser.g4 by ANTLR 4.8
package com.alibaba.seata.sqlparser.antlr.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParserParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlParserParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParserParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlParserParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParserParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(SqlParserParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParserParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(SqlParserParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParserParser#tableSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(SqlParserParser.TableSourcesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SqlParserParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnElement(SqlParserParser.SelectColumnElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParserParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(SqlParserParser.UidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParserParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(SqlParserParser.FullColumnNameContext ctx);
}