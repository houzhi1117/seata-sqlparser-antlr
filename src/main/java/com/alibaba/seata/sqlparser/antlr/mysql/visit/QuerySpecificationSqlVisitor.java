package com.alibaba.seata.sqlparser.antlr.mysql.visit;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseVisitor;

import java.util.List;

public class QuerySpecificationSqlVisitor extends MySqlParserBaseVisitor<MySqlContext> {

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
        mySqlContext.addForQueryValColumnNames(ctx.getText());
        return this.mySqlContext;
    }

    @Override
    public MySqlContext visitFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx) {
        mySqlContext.addForQueryColumnNames(ctx.getText());
        return this.mySqlContext;
    }

    @Override
    public MySqlContext visitBetweenPredicate(MySqlParser.BetweenPredicateContext ctx) {

        String text = ctx.getText();

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

    @Override
    public MySqlContext visitLogicalExpression(MySqlParser.LogicalExpressionContext ctx) {

        String text = ctx.getText();
        System.out.println(text);

        return this.mySqlContext;
    }

    @Override
    public MySqlContext visitPredicateExpression(MySqlParser.PredicateExpressionContext ctx) {

        System.out.println(ctx.getText());

        return this.mySqlContext;
    }


}