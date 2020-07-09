package com.alibaba.seata.sqlparser.antlr;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class SqlContext {

    @Getter
    private List<Table> sourceTables = new ArrayList<>();

    @Getter
    private List<Table> targetTables = new ArrayList<>();

    public void addSource(String database, String table) {
        sourceTables.add(new Table(database, table));
    }

    public void addSource(String table) {

        Table table1 = new Table();

        table1.setTable(table);
        sourceTables.add(table1);
    }

    public void addTarget(String database, String table) {
        targetTables.add(new Table(database, table));
    }


    public static class Table {
        private String database;
        private String table;

        public String getDatabase() {
            return database;
        }

        public void setDatabase(String database) {
            this.database = database;
        }

        public String getTable() {
            return table;
        }

        public void setTable(String table) {
            this.table = table;
        }

        public Table(String database, String table) {
            this.database = database;
            this.table = table;
        }

        public Table() {
        }
    }

}
