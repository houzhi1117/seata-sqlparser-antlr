package com.alibaba.seata.sqlparser.antlr.mysql.listener;

import com.alibaba.seata.sqlparser.antlr.SqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseListener;


public class QuerySpecificationSqlListener extends MySqlParserBaseListener {

    private SqlContext sqlContext;

    public QuerySpecificationSqlListener(SqlContext sqlContext) {
        this.sqlContext = sqlContext;
    }

//    @Override
//    public void enterTableIndexes(MySqlParser. ctx) {
//
//
//        //String text = ctx.tableName().getText();
//        sqlContext.addSource2(text);
//        super.enterTableIndexes(ctx);
//    }

}
