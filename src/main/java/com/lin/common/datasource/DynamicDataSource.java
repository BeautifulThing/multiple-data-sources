package com.lin.common.datasource;


import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 *  动态数据源分析:
 *      1. AbstractRoutingDataSource获取数据源之前会先调用determineCurrentLookupKey方法查找当前的lookupKey
 *      2. AbstractRoutingDataSource提供determineCurrentLookupKey抽象的方法(我们只需要重现此方法即可)
 *      3. 基于ThreadLocal 编写 DynamicDataSourceHolder类,用于获取当前线程中使用的数据源标识
 */
@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        String key = DynamicDataSourceHolder.getDataSource();
        log.info("当前操作数据源标识: {}",key);
        return key;
    }
}
