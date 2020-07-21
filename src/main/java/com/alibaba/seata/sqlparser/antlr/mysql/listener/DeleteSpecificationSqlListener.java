package com.alibaba.seata.sqlparser.antlr.mysql.listener;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseListener;

/**
 * @author houzhi
 * @date 2020-7-20
 * @description
 */
public class DeleteSpecificationSqlListener extends MySqlParserBaseListener {


    private MySqlContext sqlQueryContext;

    public DeleteSpecificationSqlListener(MySqlContext sqlQueryContext) {
        this.sqlQueryContext = sqlQueryContext;
    }

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {

        String text = ctx.getText();
        sqlQueryContext.setTableName(text);
        super.enterTableName(ctx);
    }

    @Override
    public void enterConstantExpressionAtom(MySqlParser.ConstantExpressionAtomContext ctx) {
        sqlQueryContext.addDeleteWhereValColumnNames(ctx.getText());
        super.enterConstantExpressionAtom(ctx);
    }

    @Override
    public void enterFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx) {

        sqlQueryContext.addDeleteWhereColumnNames(ctx.getText());
        super.enterFullColumnNameExpressionAtom(ctx);
    }

    @Override
    public void enterSingleDeleteStatement(MySqlParser.SingleDeleteStatementContext ctx) {

        MySqlParser.ExpressionContext expression = ctx.expression();
        sqlQueryContext.setWhereCondition(expression.getText());
        super.enterSingleDeleteStatement(ctx);
    }
}