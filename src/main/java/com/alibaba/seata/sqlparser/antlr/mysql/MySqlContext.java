package com.alibaba.seata.sqlparser.antlr.mysql;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author houzhi
 * @date 2020-7-9
 * @description
 */
public class MySqlContext {

    @Getter
    @Setter
    public String tableName;

    @Getter
    @Setter
    public Integer insertRows;

    @Getter
    public List<SQL> queryColumnNames = new ArrayList<>();

    @Getter
    public List<SQL> insertColumnNames = new ArrayList<>();

    @Getter
    public List<List<String>> insertForValColumnNames = new ArrayList<>();

    @Getter
    public List<SQL> queryForInColumnNames = new ArrayList<>();

    @Getter
    public List<SQL> queryForInValColumnNames = new ArrayList<>();

    public void addForInsertColumnName(String columnName) {
        SQL sql = new SQL();
        sql.setInsertColumnName(columnName);
        insertColumnNames.add(sql);
    }

    public void addForInsertValColumnName(List<String> columnName) {
        insertForValColumnNames.add(columnName);
    }

    public void addQueryColumnNames(String columnName) {
        SQL sql = new SQL();
        sql.setColumnName(columnName);
        queryColumnNames.add(sql);
    }

    public void addForInColumnNames(String queryForInValColumnName) {
        SQL sql = new SQL();
        sql.setQueryForInColumnName(queryForInValColumnName);
        queryForInColumnNames.add(sql);
    }

    public void addForInValColumnNames(String queryForInValColumnName) {
        SQL sql = new SQL();
        sql.setQueryForInValColumnName(queryForInValColumnName);
        queryForInValColumnNames.add(sql);
    }

    @Data
    public static class SQL {
        private String columnName;
        private String tableName;
        private String whereCondition;
        private String queryForInValColumnName;
        private String queryForInColumnName;
        private String insertColumnName;
    }
}
