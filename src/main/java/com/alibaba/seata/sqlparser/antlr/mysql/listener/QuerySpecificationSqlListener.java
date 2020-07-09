package com.alibaba.seata.sqlparser.antlr.mysql.listener;

import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseListener;

import java.util.ArrayList;
import java.util.List;


public class QuerySpecificationSqlListener extends MySqlParserBaseListener {

    private MySqlQueryContext sqlQueryContext;

    public QuerySpecificationSqlListener(MySqlQueryContext sqlQueryContext) {
        this.sqlQueryContext = sqlQueryContext;
    }

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {

        String text = ctx.getText();
        sqlQueryContext.addTableName(text);
        super.enterTableName(ctx);
    }

    @Override
    public void enterSelectElements(MySqlParser.SelectElementsContext ctx) {

        List<MySqlParser.SelectElementContext> selectElementContexts = ctx.selectElement();

        List<String> strings = new ArrayList<>();

        for (MySqlParser.SelectElementContext selectElementContext : selectElementContexts) {
            strings.add(selectElementContext.getText());
        }
        sqlQueryContext.addColumnNames(strings);
        super.enterSelectElements(ctx);
    }

    @Override
    public void enterQuerySpecification(MySqlParser.QuerySpecificationContext
                                                ctx) {

        MySqlParser.FromClauseContext fromClauseContext = ctx.fromClause();

        MySqlParser.ExpressionContext whereExpr = fromClauseContext.whereExpr;

        sqlQueryContext.addWhereCondition(whereExpr.getText());
        super.enterQuerySpecification(ctx);
    }

}
