package com.mmall.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author xyy
 * @create 2017-09-11 10:07
 **/
public class GreetingBeforeAdvice implements MethodBeforeAdvice {


    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("brfore");

    }
}
