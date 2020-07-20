package com.alibaba.seata.sqlparser.antlr.mysql.visit;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseVisitor;

import java.util.List;

public class QuerySpecificationSqlVisitor extends MySqlParserBaseVisitor<MySqlContext> {

    public MySqlParser.TableSourcesContext tableSourcesContext;

    private MySqlContext mySqlContext;

    public QuerySpecificationSqlVisitor(MySqlContext mySqlContext) {
        this.mySqlContext = mySqlContext;
    }

    @Override
    public MySqlContext visitTableSources(MySqlParser.TableSourcesContext ctx) {
        List<MySqlParser.TableSourceContext> tableSourceContexts = ctx.tableSource();
        mySqlContext.setTableName(tableSourceContexts.get(0).getText());
        return this.mySqlContext;
    }

    @Override
    public MySqlContext visitConstantExpressionAtom(MySqlParser.ConstantExpressionAtomContext ctx) {
        mySqlContext.addQueryWhereValColumnNames(ctx.getText());
        return this.mySqlContext;
    }

    @Override
    public MySqlContext visitFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx) {

        mySqlContext.addQueryWhereColumnNames(ctx.getText());
        return this.mySqlContext;
    }

    @Override
    public MySqlContext visitBetweenPredicate(MySqlParser.BetweenPredicateContext ctx) {
        mySqlContext.setWhereCondition(ctx.getText());
        return this.mySqlContext;
    }

    @Override
    public MySqlContext visitSelectElements(MySqlParser.SelectElementsContext ctx) {

        List<MySqlParser.SelectElementContext> selectElementContexts = ctx.selectElement();

        for (MySqlParser.SelectElementContext selectElementContext : selectElementContexts) {
            mySqlContext.addQueryColumnNames(selectElementContext.getText());
        }
        return this.mySqlContext;
    }

}