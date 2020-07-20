package com.alibaba.seata.sqlparser.antlr.mysql.listener;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class StatementSqlListener extends MySqlParserBaseListener {

    private MySqlContext sqlQueryContext;

    public StatementSqlListener(MySqlContext sqlQueryContext) {
        this.sqlQueryContext = sqlQueryContext;
    }

    @Override
    public void enterRoot(MySqlParser.RootContext ctx) {
        ParseTreeWalker queryWalker = new ParseTreeWalker();
        queryWalker.walk(new QuerySpecificationSqlListener(sqlQueryContext), ctx);
        super.enterRoot(ctx);
    }
}
