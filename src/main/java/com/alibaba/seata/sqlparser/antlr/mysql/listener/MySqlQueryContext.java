package com.alibaba.seata.sqlparser.antlr.mysql.listener;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houzhi
 * @date 2020-7-9
 * @description
 */
public class MySqlQueryContext {

    @Getter
    public List<String> columnNames = new ArrayList<>();

    public String queryTableName;

    public String whereCondition;

    public String addTableName(String tableName) {

        return queryTableName = tableName;
    }

    public void addColumnNames(List<String> strings) {

        columnNames.addAll(strings);
    }

    public String addWhereCondition(String condition) {

        return whereCondition = condition;
    }
}
