package com.alibaba.seata.sqlparser.antlr.mysql;

import com.alibaba.seata.sqlparser.antlr.SqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.listener.StatementSqlListener;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlLexer;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.stream.ANTLRNoCaseStringStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author houzhi
 * @date 2020-7-8
 * @description
 */
public class main {


    public static void main(String[] args) {

        String sql = "SELECT * FROM houzhi where id = 3";

        MySqlLexer lexer = new MySqlLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokenStream);

        MySqlParser.TableIndexesContext ruleContext = parser.tableIndexes();
        // listener walker
        SqlContext listenerSqlContext = new SqlContext();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new StatementSqlListener(listenerSqlContext), ruleContext);
        System.out.println("--------- listener source tables ---------");
        listenerSqlContext.getSourceTables().forEach(value -> System.out.println(value.getTable()));
        System.out.println("--------- listener target tables ---------");
        listenerSqlContext.getTargetTables().forEach(value -> System.out.println(value.getTable()));

//        System.out.println();
//
//        // visitor
//        SqlContext sqlContext = new SqlContext();
//        StatementSqlVisitor visitor = new StatementSqlVisitor(sqlContext);
//        visitor.visitTableSources(ruleContext);
//
//        List<SqlContext.Table> sourceTables = sqlContext.getSourceTables();
//        System.out.println("--------- visitor source tables ---------");
//        sqlContext.getSourceTables().forEach(value -> System.out.println(value.getTable()));
//        System.out.println("--------- visitor target tables ---------");
//        sqlContext.getTargetTables().forEach(value -> System.out.println(value));
    }
}
