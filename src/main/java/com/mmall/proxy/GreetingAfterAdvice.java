package com.mmall.proxy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author xyy
 * @create 2017-09-11 10:32
 **/
public class GreetingAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("使用AOP编程式的  after");

    }
}
