package com.mmall.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *这样所有的代理类都合并到动态代理类中了，但这样做仍然存在一个问题：JDK 给我们提供的动态代理只能代理接口，
 * 而不能代理没有接口的类。有什么方法可以解决呢？
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
        System.out.println("动态代理的  Before");
    }

    private void after() {
        System.out.println("动态代理的  After");
    }
}
