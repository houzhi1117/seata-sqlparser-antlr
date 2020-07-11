package com.alibaba.seata.sqlparser.antlr.sql;

import com.alibaba.seata.sqlparser.antlr.mysql.stream.ANTLRNoCaseStringStream;
import com.alibaba.seata.sqlparser.antlr.sql.listener.QuerySqlListener;
import com.alibaba.seata.sqlparser.antlr.sql.parser.SqlParserLexer;
import com.alibaba.seata.sqlparser.antlr.sql.parser.SqlParserParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author houzhi
 * @date 2020-7-11
 * @description
 */
public class Main {


    public static void main(String[] args) {
        String sql = "select name,age from houzhi";

        // 词法分析器
        SqlParserLexer lexer = new SqlParserLexer(new ANTLRNoCaseStringStream(sql));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        SqlParserParser parser = new SqlParserParser(tokenStream);

        SqlParserParser.SelectElementsContext statementContext = parser.selectElements();

        SqlContext sqlContext = new SqlContext();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new QuerySqlListener(sqlContext), statementContext);

        System.out.println(sqlContext.getSelectElements());
    }

}
