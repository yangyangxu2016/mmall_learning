package com.mmall.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author xyy
 * @create 2017-09-11 11:46
 **/


@Component
public class GreetingAspect {


//    @Around("execution(* com.mmall.proxy.GreetingImpl.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }

    private void before() {
        System.out.println("注解 Before");
    }

    private void after() {
        System.out.println(" 注解 After");
    }
}
