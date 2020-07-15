package com.alibaba.seata.sqlparser.antlr.mysql;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
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
    public List<SQL> queryColumnNames = new ArrayList<>();

    @Getter
    public List<SQL> queryForInColumnNames = new ArrayList<>();

    @Getter
    public List<SQL> queryForInValColumnNames = new ArrayList<>();

    public void addColumnNames(String columnName) {
        SQL sql = new SQL();
        sql.setColumnName(columnName);
        queryForInColumnNames.add(sql);
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
        public String columnName;
        public String tableName;
        public String whereCondition;
        public String queryForInValColumnName;
        public String queryForInColumnName;
    }
}
