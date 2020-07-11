package com.alibaba.seata.sqlparser.antlr.sql.listener;

import com.alibaba.seata.sqlparser.antlr.sql.SqlContext;
import com.alibaba.seata.sqlparser.antlr.sql.parser.SqlParserBaseListener;
import com.alibaba.seata.sqlparser.antlr.sql.parser.SqlParserParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houzhi
 * @date 2020-7-11
 * @description
 */
public class QuerySqlListener extends SqlParserBaseListener {

    private SqlContext sqlContext;

    public QuerySqlListener(SqlContext sqlContext) {
        this.sqlContext = sqlContext;
    }

    @Override
    public void enterSelectElements(SqlParserParser.SelectElementsContext cxt) {

        List<SqlParserParser.SelectElementContext> selectElementContexts = cxt.selectElement();

        List<String> strings = new ArrayList<>(selectElementContexts.size());
        for (SqlParserParser.SelectElementContext sql : selectElementContexts) {
            String text = sql.getText();
            strings.add(text);
        }
        sqlContext.setSelectElements(strings);
    }
}
