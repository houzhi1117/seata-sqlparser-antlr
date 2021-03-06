package com.alibaba.seata.sqlparser.antlr;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.listener.DeleteSpecificationSqlListener;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlLexer;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.stream.ANTLRNoCaseStringStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author houzhi
 * @date 2020-7-10
 * @description
 */
public class MySQLDeleteRecognizerTest {

    /**
     * Delete recognizer test 0.
     */
    @Test
    public void deleteRecognizerTest_0() {

        String sql = "DELETE FROM t1 WHERE id = 'id1'";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new DeleteSpecificationSqlListener(mySqlContext), rootContext);

        Assertions.assertEquals("t1", mySqlContext.getTableName());
        Assertions.assertEquals("id='id1'", mySqlContext.getWhereCondition());
    }


    /**
     * Delete recognizer test 1.
     */
    @Test
    public void deleteRecognizerTest_1() {

        String sql = "DELETE FROM t1 WHERE id = 'id1'";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new DeleteSpecificationSqlListener(mySqlContext), rootContext);

        Assertions.assertEquals("'id1'",
                mySqlContext.getDeleteForWhereValColumnNames().get(0).getDeleteWhereValColumnName());
        Assertions.assertEquals("id='id1'", mySqlContext.getWhereCondition());
    }


    /**
     * Delete recognizer test 1.
     */
    @Test
    public void deleteRecognizerTest_2() {

        String sql = "DELETE FROM t1 WHERE id = ?";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new DeleteSpecificationSqlListener(mySqlContext), rootContext);

        Assertions.assertEquals("?",
                mySqlContext.getDeleteForWhereValColumnNames().get(0).getDeleteWhereValColumnName());
        Assertions.assertEquals("id=?", mySqlContext.getWhereCondition());
    }


    /**
     * Delete recognizer test 2.
     */
    @Test
    public void deleteRecognizerTest_3() {

        String sql = "DELETE FROM t1 WHERE id IN (1, 2)";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new DeleteSpecificationSqlListener(mySqlContext), rootContext);

        Assertions.assertEquals("t1", mySqlContext.getTableName());
        Assertions.assertEquals("2", mySqlContext.getDeleteForWhereValColumnNames().get(1).getDeleteWhereValColumnName());
        Assertions.assertEquals("id IN (1,2)", mySqlContext.getWhereCondition());
    }

    /**
     * Delete recognizer test 3.
     */
    @Test
    public void deleteRecognizerTest_4() {

        String sql = "DELETE FROM t1 WHERE id between 1 AND 'id'";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new DeleteSpecificationSqlListener(mySqlContext), rootContext);

        Assertions.assertEquals("'id'", mySqlContext.getDeleteForWhereValColumnNames().get(1).getDeleteWhereValColumnName());
        Assertions.assertEquals("id between 1 AND 'id'", mySqlContext.getWhereCondition());
    }
}
