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

    /**
     * 表名
     */
    @Getter
    @Setter
    public String tableName;

    /**
     * 插入条数
     */
    @Getter
    @Setter
    public Integer insertRows;

    /**
     * where条件
     */
    @Getter
    @Setter
    private String whereCondition;

    /**
     * 查询列名集合
     */
    @Getter
    public List<SQL> queryColumnNames = new ArrayList<>();

    /**
     * where 查询列名条件集合
     */
    @Getter
    public List<SQL> queryWhereColumnNames = new ArrayList<>();

    /**
     * where 查询列名对应值集合
     */
    @Getter
    public List<SQL> queryWhereValColumnNames = new ArrayList<>();

    /**
     * 查询列名集合
     */
    @Getter
    public List<SQL> insertColumnNames = new ArrayList<>();

    /**
     * 插入列表对象值集合
     */
    @Getter
    public List<List<String>> insertForValColumnNames = new ArrayList<>();

    /**
     * 删除条件列表集合
     */
    @Getter
    public List<SQL> deleteForWhereColumnNames = new ArrayList<>();

    /**
     * 删除列表对象值集合
     */
    @Getter
    public List<SQL> deleteForWhereValColumnNames = new ArrayList<>();


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

    public void addQueryWhereColumnNames(String columnName) {
        SQL sql = new SQL();
        sql.setQueryWhereColumnName(columnName);
        queryWhereColumnNames.add(sql);
    }

    public void addQueryWhereValColumnNames(String columnName) {
        SQL sql = new SQL();
        sql.setQueryWhereValColumnName(columnName);
        queryWhereValColumnNames.add(sql);
    }

    public void addDeleteWhereColumnNames(String columnName) {
        SQL sql = new SQL();
        sql.setDeleteWhereColumnName(columnName);
        deleteForWhereColumnNames.add(sql);
    }

    public void addDeleteWhereValColumnNames(String columnName) {
        SQL sql = new SQL();
        sql.setDeleteWhereValColumnName(columnName);
        deleteForWhereValColumnNames.add(sql);
    }

    @Data
    public static class SQL {
        private String columnName;
        private String tableName;
        private String queryWhereValColumnName;
        private String queryWhereColumnName;
        private String insertColumnName;
        private String deleteWhereValColumnName;
        private String deleteWhereColumnName;
    }
}
