package com.alibaba.seata.sqlparser.antlr.sql;

import java.util.List;

/**
 * @author houzhi
 * @date 2020-7-11
 * @description
 */
public class SqlContext {

    private List<String> selectElements;

    public List<String> getSelectElements() {
        return selectElements;
    }

    public void setSelectElements(List<String> selectElements) {
        this.selectElements = selectElements;
    }
}
