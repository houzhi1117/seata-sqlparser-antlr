package com.alibaba.seata.sqlparser.antlr;

import com.alibaba.seata.sqlparser.antlr.mysql.listener.MySqlQueryContext;
import com.alibaba.seata.sqlparser.antlr.mysql.listener.QuerySpecificationSqlListener;
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
     * description: Test resolution table name
     */
    @Test
    public void selectForUpdateRecognizerTest_0() {

        //String sql = "SELECT name FROM t1 WHERE id = 'id1' FOR UPDATE";

        String sql = "SELECT name FROM t1 WHERE id = 'id1' FOR UPDATE";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlQueryContext sqlQueryContext = new MySqlQueryContext();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new QuerySpecificationSqlListener(sqlQueryContext), rootContext);

        Assertions.assertEquals("t1", sqlQueryContext.queryTableName);
    }

    /**
     * Select for update recognizer test 1.
     * description: Test parsing table name attribute
     */
    @Test
    public void selectForUpdateRecognizerTest_1() {

        //String sql = "SELECT name FROM t1 WHERE id = 'id1' FOR UPDATE";

        String sql = "SELECT name,age,phone FROM t1 WHERE id = 'id1' FOR UPDATE";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlQueryContext sqlQueryContext = new MySqlQueryContext();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new QuerySpecificationSqlListener(sqlQueryContext), rootContext);

        Assertions.assertEquals("t1", sqlQueryContext.queryTableName);
        Assertions.assertEquals("phone", sqlQueryContext.columnNames.get(2));
    }


    /**
     * Select for update recognizer test 1.
     * description: Test parsing table query conditions
     */
    @Test
    public void selectForUpdateRecognizerTest_2() {

        //String sql = "SELECT name FROM t1 WHERE id = 'id1' FOR UPDATE";

        String sql = "SELECT name,age,phone FROM t1 WHERE id = 'id1' FOR UPDATE";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlQueryContext sqlQueryContext = new MySqlQueryContext();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new QuerySpecificationSqlListener(sqlQueryContext), rootContext);

        Assertions.assertEquals("t1", sqlQueryContext.queryTableName);
        Assertions.assertEquals("phone", sqlQueryContext.columnNames.get(2));
        Assertions.assertEquals("id='id1'", sqlQueryContext.whereCondition);
    }
}