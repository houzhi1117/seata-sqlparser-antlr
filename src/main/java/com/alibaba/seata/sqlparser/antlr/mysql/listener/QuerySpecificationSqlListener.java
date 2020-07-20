package com.alibaba.seata.sqlparser.antlr.mysql.listener;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseListener;

import java.util.List;


public class QuerySpecificationSqlListener extends MySqlParserBaseListener {

    private MySqlContext sqlQueryContext;

    public QuerySpecificationSqlListener(MySqlContext sqlQueryContext) {
        this.sqlQueryContext = sqlQueryContext;
    }

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {

        String text = ctx.getText();
        sqlQueryContext.setTableName(text);
        super.enterTableName(ctx);
    }

    @Override
    public void enterFromClause(MySqlParser.FromClauseContext ctx) {

        MySqlParser.ExpressionContext whereExpr = ctx.whereExpr;
        sqlQueryContext.setWhereCondition(whereExpr.getText());
        super.enterFromClause(ctx);
    }

    @Override
    public void enterFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx) {

        sqlQueryContext.addQueryWhereColumnNames(ctx.getText());
        super.enterFullColumnNameExpressionAtom(ctx);
    }

    @Override
    public void enterConstantExpressionAtom(MySqlParser.ConstantExpressionAtomContext ctx) {
        sqlQueryContext.addQueryWhereValColumnNames(ctx.getText());
        super.enterConstantExpressionAtom(ctx);
    }



    @Override
    public void enterSelectElements(MySqlParser.SelectElementsContext ctx) {

        List<MySqlParser.SelectElementContext> selectElementContexts = ctx.selectElement();

        for (MySqlParser.SelectElementContext selectElementContext : selectElementContexts) {
            sqlQueryContext.addQueryColumnNames(selectElementContext.getText());
        }
        super.enterSelectElements(ctx);
    }
}
