package com.alibaba.seata.sqlparser.antlr;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlLexer;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.stream.ANTLRNoCaseStringStream;
import com.alibaba.seata.sqlparser.antlr.mysql.visit.StatementSqlVisitor;
import org.antlr.v4.runtime.CommonTokenStream;
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
     * description: Test parsing table name
     */
    @Test
    public void selectForUpdateRecognizerTest_0() {

        String sql = "SELECT name FROM t1 WHERE id = 'id1' FOR UPDATE";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext visitorSqlContext = new MySqlContext();
        StatementSqlVisitor visitor = new StatementSqlVisitor(visitorSqlContext);
        visitor.visit(rootContext);

        Assertions.assertEquals("t1", visitorSqlContext.getTableName());
    }

    /**
     * Select for update recognizer test 1.
     * description: Test parsing table name attribute
     */
    @Test
    public void selectForUpdateRecognizerTest_1() {

        String sql = "SELECT name,age,phone FROM t1 WHERE id = 'id1' FOR UPDATE";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        StatementSqlVisitor visitor = new StatementSqlVisitor(mySqlContext);
        visitor.visit(rootContext);

        Assertions.assertEquals("t1", mySqlContext.getTableName());
        Assertions.assertEquals("phone", mySqlContext.getQueryColumnNames().get(2).getColumnName());
    }


    /**
     * Select for update recognizer test 1.
     * description: Test parsing table query conditions
     */
    @Test
    public void selectForUpdateRecognizerTest_2() {

        String sql = "SELECT name,age,phone FROM t2 WHERE id = 'id'FOR UPDATE";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        StatementSqlVisitor visitor = new StatementSqlVisitor(mySqlContext);
        visitor.visit(rootContext);

        Assertions.assertEquals("t2", mySqlContext.getTableName());
        Assertions.assertEquals("phone", mySqlContext.getQueryColumnNames().get(2).getColumnName());
//        Assertions.assertEquals("id='id'", mySqlContext.getWhereCondition());
    }


    /**
     * Select for update recognizer test 1.
     * description: Test parsing table query conditions
     */
    @Test
    public void selectForUpdateRecognizerTest_3() {

        String sql = "SELECT name,phone FROM t1 WHERE id = 1 and username = '11' and age = 'a' or hz = '1' or aa = 1 FOR UPDATE";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();

        StatementSqlVisitor visitor = new StatementSqlVisitor(mySqlContext);
        visitor.visit(rootContext);

        Assertions.assertEquals("t1", mySqlContext.getTableName());
        Assertions.assertEquals("name", mySqlContext.getQueryColumnNames().get(0).getColumnName());
        //Assertions.assertEquals("id", mySqlContext.get().get(0).getQueryForInColumnName());
    }

    /**
     * Select for update recognizer test 1.
     * description: Test parsing table query conditions
     */
    @Test
    public void selectForUpdateRecognizerTest_4() {

        String sql = "SELECT name1, name2 FROM t1 WHERE id IN (100,101) FOR UPDATE";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();

        StatementSqlVisitor visitor = new StatementSqlVisitor(mySqlContext);
        visitor.visit(rootContext);

        Assertions.assertEquals("t1", mySqlContext.getTableName());
        Assertions.assertEquals("name1", mySqlContext.getQueryColumnNames().get(0).getColumnName());
        Assertions.assertEquals("id", mySqlContext.getQueryForInColumnNames().get(0).getQueryForInColumnName());
        Assertions.assertEquals("101", mySqlContext.getQueryForInValColumnNames().get(1).getQueryForInValColumnName());
    }
}