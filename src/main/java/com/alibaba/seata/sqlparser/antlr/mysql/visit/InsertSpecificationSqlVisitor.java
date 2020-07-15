package com.alibaba.seata.sqlparser.antlr.mysql.visit;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseVisitor;

import java.util.Arrays;
import java.util.List;

/**
 * @author houzhi
 * @date 2020-7-15
 * @description
 */
public class InsertSpecificationSqlVisitor extends MySqlParserBaseVisitor<MySqlContext> {

    private MySqlContext mySqlContext;

    public InsertSpecificationSqlVisitor(MySqlContext mySqlContext) {
        this.mySqlContext = mySqlContext;
    }

    @Override
    public MySqlContext visitInsertStatement(MySqlParser.InsertStatementContext ctx) {

        MySqlParser.TableNameContext tableNameContext = ctx.tableName();

        mySqlContext.setTableName(tableNameContext.getText());

        MySqlParser.UidListContext columns = ctx.columns;

        List<String> strings = Arrays.asList(columns.getText().split(","));

        for (String insertColumnName : strings) {
            mySqlContext.addForInsertColumnName(insertColumnName);
        }

        MySqlParser.InsertStatementValueContext insertStatementValueContext = ctx.insertStatementValue();
        List<MySqlParser.ExpressionsWithDefaultsContext> expressionsWithDefaultsContexts = insertStatementValueContext.expressionsWithDefaults();

        for (MySqlParser.ExpressionsWithDefaultsContext expressions : expressionsWithDefaultsContexts) {

            String text = expressions.getText();
            String str = null;
            if (text.contains("'")) {
                str = text.replace("'", "");
            } else if (text.contains("\"")) {
                str = text.replace("\"", "");
            }
            if (!str.isEmpty()) {
                mySqlContext.addForInsertValColumnName(Arrays.asList(str.split(",")));
            }
        }
        mySqlContext.setInsertRows(expressionsWithDefaultsContexts.size());
        return this.mySqlContext;
    }
}
