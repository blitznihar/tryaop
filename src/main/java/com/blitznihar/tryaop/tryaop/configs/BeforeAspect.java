package com.blitznihar.tryaop.tryaop.configs;

import java.sql.Timestamp;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

    @Around("execution(* com.blitznihar.tryaop.tryaop.services.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
            Date dateBefore = new Date();
            System.out.println(String.format("Around: Intercepted Method Call %s At %s", proceedingJoinPoint,new Timestamp(dateBefore.getTime())));
            Object result=proceedingJoinPoint.proceed();
            Date dateAfter = new Date();
            System.out.println(String.format("Around: Intercepted Method Call %s At %s", proceedingJoinPoint,new Timestamp(dateAfter.getTime())));
            
            System.out.println(String.format("Around: Intercepted Method Call %s Total Time (ms) %s", proceedingJoinPoint,dateAfter.getTime() - dateBefore.getTime()));
            return result;    
    }
    @Before("execution(* com.blitznihar.tryaop.tryaop.services.*.*(..))")
    public void before(JoinPoint joinPoint){
        Date date = new Date();
        System.out.println(String.format("Before: Intercepted Method Call %s At %s", joinPoint,new Timestamp(date.getTime())));
    }

    @AfterReturning("execution(* com.blitznihar.tryaop.tryaop.services.*.*(..))")
    public void afterReturning(JoinPoint joinPoint){
        Date date = new Date();
        System.out.println(String.format("AfterReturning: Intercepted Method Call %s At %s", joinPoint,new Timestamp(date.getTime())));
    }
    @AfterThrowing("execution(* com.blitznihar.tryaop.tryaop.services.*.*(..))")
    public void afterThrowing(JoinPoint joinPoint){
        Date date = new Date();
        System.out.println(String.format("AfterThrowing: Intercepted Method Call %s At %s", joinPoint,new Timestamp(date.getTime())));
    }
    @After("execution(* com.blitznihar.tryaop.tryaop.services.*.*(..))")
    public void after(JoinPoint joinPoint){
        Date date = new Date();
        System.out.println(String.format("After: Intercepted Method Call %s At %s", joinPoint,new Timestamp(date.getTime())));
    }
    
}
