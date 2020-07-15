//package com.alibaba.seata.sqlparser.antlr.mysql.listener;
//
//
//import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
//import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseListener;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//
//public class InsertIntoTableSqlListener extends MySqlParserBaseListener {
//
//    private MySqlInsertContext sqlInsertContext;
//
//    public InsertIntoTableSqlListener(MySqlInsertContext sqlInsertContext) {
//        this.sqlInsertContext = sqlInsertContext;
//    }
//
//    @Override
//    public void enterInsertStatement(MySqlParser.InsertStatementContext ctx) {
//
//        String tableName = ctx.tableName().getText();
//
//        String columnsStr = ctx.columns.getText();
//
//        if (!columnsStr.isEmpty()) {
//            String[] columns = columnsStr.split(",");
//            sqlInsertContext.addInsertColumns(columns);
//        }
//
//        sqlInsertContext.addTableName(tableName);
//
//        MySqlParser.InsertStatementValueContext insertStatementValueContext = ctx.insertStatementValue();
//
//        List<MySqlParser.ExpressionsWithDefaultsContext> expressionsWithDefaultsContexts = insertStatementValueContext.expressionsWithDefaults();
//
//        List<List<String>> insertRows = new ArrayList<>();
//
//        for (MySqlParser.ExpressionsWithDefaultsContext expressions : expressionsWithDefaultsContexts) {
//
//            String text = expressions.getText();
//
//            String str = null;
//            if (text.contains("'")) {
//                str = text.replace("'", "");
//            } else if (text.contains("\"")) {
//                str = text.replace("\"", "");
//            }
//            if (!str.isEmpty()) {
//                insertRows.add(Arrays.asList(str.split(",")));
//            }
//        }
//        sqlInsertContext.addInsertRows(insertRows);
//
//        super.enterInsertStatement(ctx);
//    }
//
//}
