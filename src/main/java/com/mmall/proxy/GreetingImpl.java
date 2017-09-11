package com.mmall.proxy;

import org.springframework.stereotype.Component;

/**
 * @author xyy
 * @create 2017-09-11 10:18
 **/
@Component
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        before();
        System.out.println("Hello! " + name);
        after();
    }


    private void before() {
        System.out.println("写死在代码中的  Before ");
    }

    private void after() {
        System.out.println("写死在代码中的  After");
    }
}
