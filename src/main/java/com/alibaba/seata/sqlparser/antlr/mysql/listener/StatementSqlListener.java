package com.alibaba.seata.sqlparser.antlr.mysql.listener;

import com.alibaba.seata.sqlparser.antlr.SqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class StatementSqlListener extends MySqlParserBaseListener {

    private SqlContext sqlContext;

    public StatementSqlListener(SqlContext sqlContext) {
        this.sqlContext = sqlContext;
    }

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {
        ParseTreeWalker queryWalker = new ParseTreeWalker();
        queryWalker.walk(new QuerySpecificationSqlListener(sqlContext), ctx);
        super.enterTableName(ctx);
    }
}
