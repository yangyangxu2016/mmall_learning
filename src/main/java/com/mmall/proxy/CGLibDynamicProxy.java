package com.mmall.proxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用CGLib动态代理
 *
 * @author xyy
 * @create 2017-09-11 9:52
 **/
public class CGLibDynamicProxy implements MethodInterceptor {


    private static CGLibDynamicProxy instance = new CGLibDynamicProxy();

    private CGLibDynamicProxy() {

    }


    public static CGLibDynamicProxy getInstance() {
        return instance;
    }


    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }


    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object result = proxy.invokeSuper(target, args);
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
