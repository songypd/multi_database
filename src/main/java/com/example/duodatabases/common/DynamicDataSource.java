package com.example.duodatabases.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author yuanpeng.song
 * @create 2018/8/16
 * @since 1.0.0
 * 使用DatabaseContextHolder获取当前线程的DatabaseType
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * 动态数据源（需要继承AbstractRoutingDataSource）
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataBaseContextHolder.getDatabaseType();
    }
}