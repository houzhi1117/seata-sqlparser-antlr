package com.alibaba.seata.sqlparser.antlr;

import com.alibaba.seata.sqlparser.antlr.mysql.listener.StatementSqlListener;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlLexer;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.stream.ANTLRNoCaseStringStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author houzhi
 * @date 2020-7-9
 * @description
 */
public class MySQLSelectForUpdateRecognizerTest {


    /**
     * Select for update recognizer test 0.
     */
    @Test
    public void selectForUpdateRecognizerTest_0() {

        //String sql = "SELECT name FROM t1 WHERE id = 'id1' FOR UPDATE";

        String sql = "SELECT NAME FROM T1 WHERE ID = 'id1' FOR UPDATE";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.TableNameContext ruleContext = parser.tableName();

        SqlContext listenerSqlContext = new SqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new StatementSqlListener(listenerSqlContext), ruleContext);

        listenerSqlContext.getSourceTables().forEach(value -> System.out.println(value.getTable()));

        Assertions.assertEquals("T1", listenerSqlContext.getSourceTables().get(0).getTable());
    }
}
