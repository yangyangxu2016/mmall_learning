package com.mmall.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author xyy
 * @create 2017-09-11 9:38
 **/
public class JDKDynamicProxy implements InvocationHandler {


    private Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }


    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();

        Object result = method.invoke(target, args);

        after();


        return result;
    }


    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
