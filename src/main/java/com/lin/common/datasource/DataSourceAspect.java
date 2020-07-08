package com.lin.common.datasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 *  数据源切面
 */
@Slf4j
@Aspect
@Component
public class DataSourceAspect {
    @Pointcut("execution(* com.lin.service.impl.*ServiceImpl.*(..))")
    public void DataSourceAspect(){
        log.info("DataSourceAspect 被调用 ...");
    }
    @Before("DataSourceAspect()")
    public void doBefore(JoinPoint joinPoint){
        log.info("DataSourceAspect doBefore 被调用 ...");
        /*
        String key = "db_one";
        Object target = joinPoint.getTarget();
        String method = joinPoint.getSignature().getName();
        Class<?>[] clazz = target.getClass().getInterfaces();
        Class<?>[] parameterTypes = ((MethodSignature) joinPoint.getSignature())
                .getMethod().getParameterTypes();
        try {
            Method exitMethod = clazz[0].getMethod(method, parameterTypes);
            if (exitMethod != null && exitMethod.isAnnotationPresent(DataSource.class)) {
                DataSource data = exitMethod.getAnnotation(DataSource.class);
                key = data.value();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("method:" + method + ", key:" + key);
        DynamicDataSourceHolder.putDataSource(key);
        */
    }
    public void doAfter(){
        log.info("DataSourceAspect doAfter 被调用 ...");
    }
}
