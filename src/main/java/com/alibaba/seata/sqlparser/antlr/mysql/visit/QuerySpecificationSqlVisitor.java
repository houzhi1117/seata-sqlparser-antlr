//package com.alibaba.seata.sqlparser.antlr.mysql.visit;
//
//import com.alibaba.seata.sqlparser.antlr.SqlContext;
//import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
//import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseVisitor;
//import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlQueryParser;
//import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlQueryVisitor;
//import org.antlr.v4.runtime.Token;
//import org.antlr.v4.runtime.tree.ErrorNode;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.RuleNode;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import java.util.List;
//
//
//public class QuerySpecificationSqlVisitor extends MySqlParserBaseVisitor<SqlContext> {
//
//    private SqlContext sqlContext;
//
//    public QuerySpecificationSqlVisitor(SqlContext sqlContext) {
//        this.sqlContext = sqlContext;
//    }
//
//    @Override
//    public SqlContext visitTableSources(MySqlParser.ShowStatementContext ctx) {
////        return super.visitTableIdentifier(ctx);
//        List<MySqlParser.TableNameContext> tableNameContexts = ctx.tableName();
//
//        for (MySqlParser.TableNameContext table : tableNameContexts) {
//
//
//            sqlContext.addSource2(text1);
//        }
//        return this.sqlContext;
//    }
//
//}
