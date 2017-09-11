package com.mmall.proxy;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author xyy
 * @create 2017-09-11 10:33
 **/
public class GreetingBeforeAndAfterAdvice implements MethodBeforeAdvice,AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("使用AOP编程式的 添加前置和后置增强  after");

    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("使用AOP编程式的 添加前置和后置增强  brfore");

    }
}
