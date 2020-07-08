package com.alibaba.seata.sqlparser.antlr.mysql.listener;


import com.alibaba.seata.sqlparser.antlr.SqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseListener;

/**
 * @author wang_zh
 * @date 2020/4/14
 */
public class InsertIntoTableSqlListener extends MySqlParserBaseListener {

    private SqlContext sqlContext;

    public InsertIntoTableSqlListener(SqlContext sqlContext) {
        this.sqlContext = sqlContext;
    }
//
//    @Override
//    public void enterTableName(MySqlQueryParser.TableNameContext ctx) {
//        if (ctx == null) return;
//        super.enterTableIdentifier(ctx);
//    }

}
