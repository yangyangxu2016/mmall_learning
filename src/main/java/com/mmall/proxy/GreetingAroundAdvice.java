package com.mmall.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @author xyy
 * @create 2017-09-11 10:44
 **/
@Component
public class GreetingAroundAdvice implements MethodInterceptor {



    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        before();
        Object result = invocation.proceed();
        after();
        return result;
    }


    private void before() {
        System.out.println(" 环绕增强 Before");
    }

    private void after() {
        System.out.println(" 环绕增强 After");
    }
}
