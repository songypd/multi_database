package com.example.duodatabases.aop;

import com.example.duodatabases.common.DataBaseContextHolder;
import com.example.duodatabases.contast.DataBaseType;
import com.example.duodatabases.service.FinanceService;
import com.example.duodatabases.service.serviceImpl.FinanceServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
public class DataBaseAspect {
    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(* com.example.duodatabases.service.*.*(..))")
    public void declareJointPointExpression() {
    }

    @Before("declareJointPointExpression()")
    public void setDataSourceKey(JoinPoint point) {
        //根据连接点所属的类实例，动态切换数据源
        if (point.getTarget() instanceof FinanceService
                || point.getTarget() instanceof FinanceServiceImpl) {
            DataBaseContextHolder.setDatabaseType(DataBaseType.dataBase_001);
        } else {//连接点所属的类实例是（当然，这一步也可以不写，因为defaultTargertDataSource就是该类所用的mytestdb）
            DataBaseContextHolder.setDatabaseType(DataBaseType.dataBase_002);
        }
    }
}