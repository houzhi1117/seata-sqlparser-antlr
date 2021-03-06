package com.alibaba.seata.sqlparser.antlr;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.listener.UpdateSpecificationSqlListener;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlLexer;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.stream.ANTLRNoCaseStringStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * The type My sql update recognizer test.
 */
public class MySQLUpdateRecognizerTest {

    /**
     * Update recognizer test 0.
     */
    @Test
    public void updateRecognizerTest_0() {

        String sql = "UPDATE t1 SET name = 'name1' WHERE id = 'id1'";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new UpdateSpecificationSqlListener(mySqlContext), rootContext);

        Assertions.assertEquals("t1", mySqlContext.getTableName());
        //Assertions.assertEquals(1, mySQLUpdateRecognizer.getUpdateColumns().size());
        Assertions.assertEquals("id", mySqlContext.getUpdateForWhereColumnNames().get(0).getUpdateWhereColumnName());
        Assertions.assertEquals("name", mySqlContext.getUpdateFoColumnNames().get(0).getUpdateColumn());
//        Assertions.assertEquals("id = 'id1'", mySQLUpdateRecognizer.getWhereCondition());
    }

    /**
     * Update recognizer test 1.
     */
    @Test
    public void updateRecognizerTest_1() {

        String sql = "UPDATE t1 SET name1 = name1, name2 = name2 WHERE id = 'id1'";
        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new UpdateSpecificationSqlListener(mySqlContext), rootContext);

        Assertions.assertEquals("t1", mySqlContext.getTableName());
        Assertions.assertEquals("name1", mySqlContext.getUpdateFoColumnNames().get(0).getUpdateColumn());
        Assertions.assertEquals("name1", mySqlContext.getUpdateForValues().get(0).getUpdateValue());
        Assertions.assertEquals("name2", mySqlContext.getUpdateFoColumnNames().get(1).getUpdateColumn());
        Assertions.assertEquals("name2", mySqlContext.getUpdateForValues().get(1).getUpdateValue());
        Assertions.assertEquals("id='id1'", mySqlContext.getWhereCondition());
    }


    /**
     * Update recognizer test 2.
     */
    @Test
    public void updateRecognizerTest_2() {

        String sql = "UPDATE t1 SET name1 = 'name1', name2 = 'name2' WHERE id = ?";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new UpdateSpecificationSqlListener(mySqlContext), rootContext);

        List<MySqlContext.SQL> updateForWhereValColumnNames = mySqlContext.getUpdateForWhereValColumnNames();

        System.out.println(updateForWhereValColumnNames);

        Assertions.assertEquals("?", mySqlContext.getUpdateForWhereValColumnNames().get(0).getUpdateWhereValColumnName());
        Assertions.assertEquals("name1", mySqlContext.getUpdateFoColumnNames().get(0).getUpdateColumn());
        Assertions.assertEquals("name2", mySqlContext.getUpdateFoColumnNames().get(1).getUpdateColumn());
        Assertions.assertEquals("id=?", mySqlContext.getWhereCondition());
    }


    /**
     * Update recognizer test 3.
     */
    @Test
    public void updateRecognizerTest_3() {

        String sql = "UPDATE t1 SET name1 = 'name1', name2 = 'name2' WHERE id in (1, 2)";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new UpdateSpecificationSqlListener(mySqlContext), rootContext);

        Assertions.assertEquals("1", mySqlContext.getUpdateForWhereValColumnNames().get(0).getUpdateWhereValColumnName());
        Assertions.assertEquals("t1", mySqlContext.getTableName());
        Assertions.assertEquals("name1", mySqlContext.getUpdateFoColumnNames().get(0).getUpdateColumn());
        Assertions.assertEquals("'name1'", mySqlContext.getUpdateForValues().get(0).getUpdateValue());
        Assertions.assertEquals("name2", mySqlContext.getUpdateFoColumnNames().get(1).getUpdateColumn());
        Assertions.assertEquals("id in (1,2)", mySqlContext.getWhereCondition());
    }


    /**
     * Update recognizer test 5.
     */
    @Test
    public void updateRecognizerTest_5() {

        String sql = "UPDATE t1 SET name1 = 'name1', name2 = 'name2' WHERE id between 1 and 2";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.RootContext rootContext = parser.root();

        MySqlContext mySqlContext = new MySqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new UpdateSpecificationSqlListener(mySqlContext), rootContext);
        Assertions.assertEquals("t1", mySqlContext.getTableName());
        Assertions.assertEquals("name1", mySqlContext.getUpdateFoColumnNames().get(0).getUpdateColumn());
        Assertions.assertEquals("'name1'", mySqlContext.getUpdateForValues().get(0).getUpdateValue());
        Assertions.assertEquals("name2", mySqlContext.getUpdateFoColumnNames().get(1).getUpdateColumn());
        Assertions.assertEquals("2", mySqlContext.getUpdateForWhereValColumnNames().get(1).getUpdateWhereValColumnName());
        Assertions.assertEquals("id between 1 and 2", mySqlContext.getWhereCondition());
    }
}