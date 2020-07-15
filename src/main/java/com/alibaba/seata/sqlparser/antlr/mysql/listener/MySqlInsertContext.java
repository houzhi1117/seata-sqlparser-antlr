//package com.alibaba.seata.sqlparser.antlr.mysql.listener;
//
//import lombok.Getter;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @author houzhi
// * @date 2020-7-9
// * @description
// */
//public class MySqlInsertContext {
//
//    @Getter
//    public List<String> columnNames = new ArrayList<>();
//
//    @Getter
//    public List<List<String>> insertRows = new ArrayList<>();
//
//    public String insertTableName;
//
//    public String addTableName(String tableName) {
//
//        return insertTableName = tableName;
//    }
//
//    public void addInsertColumns(String[] arr) {
//
//        columnNames.addAll(Arrays.asList(arr));
//    }
//
//    public void addInsertRows(List<List<String>> strings) {
//
//        insertRows.addAll(strings);
//    }
//}
