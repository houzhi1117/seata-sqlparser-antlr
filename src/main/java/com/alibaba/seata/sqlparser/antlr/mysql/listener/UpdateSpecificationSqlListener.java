package com.alibaba.seata.sqlparser.antlr.mysql.listener;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * @author houzhi
 * @date 2020-7-20
 * @description
 */
public class UpdateSpecificationSqlListener extends MySqlParserBaseListener {


    private MySqlContext sqlQueryContext;

    public UpdateSpecificationSqlListener(MySqlContext sqlQueryContext) {
        this.sqlQueryContext = sqlQueryContext;
    }

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {

        String text = ctx.getText();
        sqlQueryContext.setTableName(text);
        super.enterTableName(ctx);
    }


    @Override
    public void enterConstantExpressionAtomForUpdate(MySqlParser.ConstantExpressionAtomForUpdateContext ctx) {
        sqlQueryContext.addUpdateWhereValColumnNames(ctx.getText());
        super.enterConstantExpressionAtomForUpdate(ctx);
    }

    @Override
    public void enterFullColumnNameExpressionAtomForUpdate(MySqlParser.FullColumnNameExpressionAtomForUpdateContext ctx) {
        sqlQueryContext.addUpdateWhereColumnNames(ctx.getText());
        super.enterFullColumnNameExpressionAtomForUpdate(ctx);
    }

    @Override
    public void enterSingleUpdateStatement(MySqlParser.SingleUpdateStatementContext ctx) {
        MySqlParser.ExpressionForUpdateContext expressionForUpdateContext = ctx.expressionForUpdate();
        sqlQueryContext.setWhereCondition(expressionForUpdateContext.getText());
        super.enterSingleUpdateStatement(ctx);
    }

    @Override
    public void enterUpdatedElement(MySqlParser.UpdatedElementContext ctx) {

        MySqlParser.ExpressionContext expression = ctx.expression();
        sqlQueryContext.addUpdateValues(expression.getText());

        MySqlParser.FullColumnNameContext fullColumnNameContext = ctx.fullColumnName();
        sqlQueryContext.addUpdateColumnNames(fullColumnNameContext.getText());

        super.enterUpdatedElement(ctx);
    }

}