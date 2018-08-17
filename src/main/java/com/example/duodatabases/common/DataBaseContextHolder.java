package com.example.duodatabases.common;

import com.example.duodatabases.contast.DataBaseType;

/**
 * @author yuanpeng.song
 * @create 2018/8/16
 * @since 1.0.0
 * 作用：构建一个DatabaseType容器，并提供了向其中设置和获取DatabaseType的方法
 */

/**
 * 作用：
 * 1、保存一个线程安全的DatabaseType容器
 */
public class DataBaseContextHolder {

    private static final ThreadLocal<DataBaseType> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(DataBaseType type) {
        contextHolder.set(type);
    }

    public static DataBaseType getDatabaseType() {
        return contextHolder.get();
    }
}