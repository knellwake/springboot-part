package com.wake.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: Doug
 * @Date: 2024-03-12 15:39
 * @Description:
 */
@Component
@Aspect
@Order(5)
public class LogAdvice {
    @Before("execution(* com..service.*.*(..))")
    public void before(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(className + " :: " + methodName + " 开启执行！");
    }
}