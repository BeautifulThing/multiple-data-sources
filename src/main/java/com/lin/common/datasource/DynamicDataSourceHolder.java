package com.lin.common.datasource;

/**
 * 处理持有当前线程中使用的数据源标识(ThreadLocal)
 */
public class DynamicDataSourceHolder {
    public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    public static void putDataSource(String name) {
        holder.set(name);
    }

    public static String getDataSource() {
        return holder.get();
    }
}
