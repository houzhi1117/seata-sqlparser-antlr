package com.alibaba.seata.sqlparser.antlr.mysql.visit;

import com.alibaba.seata.sqlparser.antlr.mysql.MySqlContext;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParser;
import com.alibaba.seata.sqlparser.antlr.mysql.parser.MySqlParserBaseVisitor;


public class StatementSqlVisitor extends MySqlParserBaseVisitor<MySqlContext> {

    private MySqlContext mySqlContext;

    public StatementSqlVisitor(MySqlContext mySqlContext) {
        this.mySqlContext = mySqlContext;
    }

    @Override
    public MySqlContext visitFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx) {
        return new QuerySpecificationSqlVisitor(this.mySqlContext).visitFullColumnNameExpressionAtom(ctx);
    }

    @Override
    public MySqlContext visitTableSources(MySqlParser.TableSourcesContext ctx) {
        return new QuerySpecificationSqlVisitor(this.mySqlContext).visitTableSources(ctx);
    }

    @Override
    public MySqlContext visitConstantExpressionAtom(MySqlParser.ConstantExpressionAtomContext ctx) {
        return new QuerySpecificationSqlVisitor(this.mySqlContext).visitConstantExpressionAtom(ctx);
    }

    @Override
    public MySqlContext visitSelectElements(MySqlParser.SelectElementsContext ctx) {
        return new QuerySpecificationSqlVisitor(this.mySqlContext).visitSelectElements(ctx);
    }

}
