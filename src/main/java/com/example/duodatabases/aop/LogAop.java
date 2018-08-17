package com.example.duodatabases.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author yuanpeng.song
 * @create 2018/8/17
 * @since 1.0.0
 */
@Aspect
@Component
@Slf4j
@Order(0)
public class LogAop {

    /**
     * @Description: 日志切点
     */
    @Pointcut("execution(* com.example.duodatabases.service.serviceImpl..*.*(..))")
    public void logPoint(){

    }
}