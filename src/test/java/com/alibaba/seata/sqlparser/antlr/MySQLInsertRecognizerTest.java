//package com.alibaba.seata.sqlparser.antlr;
//
//
//import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlLexer;
//import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
//import com.alibaba.seata.sqlparser.antlr.mysql.stream.ANTLRNoCaseStringStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.Collections;
//
///**
// * @author houzhi
// * @date 2020-7-10
// * @description
// */
//public class MySQLInsertRecognizerTest {
//
//    /**
//     * Insert recognizer test 0.
//     */
//    @Test
//    public void insertRecognizerTest_0() {
//
//        String sql = "INSERT INTO t1 (name) VALUES ('name1')";
//
//        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));
//
//        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//
//        MySqlParser parser = new MySqlParser(tokenStream);
//
//        MySqlParser.RootContext rootContext = parser.root();
//
//        MySqlInsertContext sqlInsertContext = new MySqlInsertContext();
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new InsertIntoTableSqlListener(sqlInsertContext), rootContext);
//
//        Assertions.assertEquals("t1", sqlInsertContext.insertTableName);
//        Assertions.assertEquals(Collections.singletonList("name"), sqlInsertContext.columnNames);
//        Assertions.assertEquals(1, sqlInsertContext.insertRows.size());
//        Assertions.assertEquals(Collections.singletonList("name1"), sqlInsertContext.insertRows.get(0));
//    }
//
//    /**
//     * Insert recognizer test 1.
//     */
//    @Test
//    public void insertRecognizerTest_1() {
//
//        String sql = "INSERT INTO t1 (name1, name2) VALUES ('name1', 'name2')";
//
//        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));
//
//        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//
//        MySqlParser parser = new MySqlParser(tokenStream);
//
//        MySqlParser.RootContext rootContext = parser.root();
//
//        MySqlInsertContext sqlInsertContext = new MySqlInsertContext();
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new InsertIntoTableSqlListener(sqlInsertContext), rootContext);
//
//        Assertions.assertEquals("t1", sqlInsertContext.insertTableName);
//        Assertions.assertEquals(Arrays.asList("name1", "name2"), sqlInsertContext.columnNames);
//        Assertions.assertEquals(1, sqlInsertContext.insertRows.size());
//        Assertions.assertEquals(Arrays.asList("name1", "name2"), sqlInsertContext.insertRows.get(0));
//    }
//
//    /**
//     * Insert recognizer test 3.
//     */
//    @Test
//    public void insertRecognizerTest_3() {
//
//        String sql = "INSERT INTO t1 (name1, name2) VALUES ('name1', 'name2'), ('name3', 'name4'), ('name5', 'name6')";
//
//        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));
//
//        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//
//        MySqlParser parser = new MySqlParser(tokenStream);
//
//        MySqlParser.RootContext rootContext = parser.root();
//
//        MySqlInsertContext sqlInsertContext = new MySqlInsertContext();
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new InsertIntoTableSqlListener(sqlInsertContext), rootContext);
//
//        Assertions.assertEquals("t1", sqlInsertContext.insertTableName);
//        Assertions.assertEquals(Arrays.asList("name1", "name2"), sqlInsertContext.columnNames);
//        Assertions.assertEquals(3, sqlInsertContext.insertRows.size());
//        Assertions.assertEquals(Arrays.asList("name1", "name2"), sqlInsertContext.insertRows.get(0));
//        Assertions.assertEquals(Arrays.asList("name3", "name4"), sqlInsertContext.insertRows.get(1));
//        Assertions.assertEquals(Arrays.asList("name5", "name6"), sqlInsertContext.insertRows.get(2));
//    }
//
//
////    INSERT ALL INTO ord_order_z_flow
////            (FLOW_ID, order_Id)
////    VALUES
////            ('123456577123457', '123456577123454') INTO ord_order_z_flow
////  (FLOW_ID, order_Id)
////    VALUES
////            ('123456577123458', '123456577123454') INTO ord_order_z_flow
////  (FLOW_ID, order_Id)
////    VALUES
////            ('123456577123459', '123456577123454') INTO ord_order_z_flow
////  (FLOW_ID, order_Id)
////    VALUES
////            ('123456577123460', '123456577123454') INTO ord_order_z_flow
////  (FLOW_ID, order_Id)
////    VALUES
////            ('123456577123461', '123456577123454')
////    SELECT 1 FROM DUAL)
//}
