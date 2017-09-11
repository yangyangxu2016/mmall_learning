package com.mmall.proxy;

/**
 * 直接使用代理的，这样写没错，但是有个问题，XxxProxy 这样的类会越来越多，如何才能将这些代理类尽可能减少呢？最好只有一个代理类。

 这时我们就需要使用 JDK 提供的动态代理了
 * @author xyy
 * @create 2017-09-11 10:20
 **/
public class GreetingProxy implements Greeting {


    private GreetingImpl greetingImpl;


    public GreetingProxy(GreetingImpl greetingImpl) {
        this.greetingImpl = greetingImpl;
    }


    @Override
    public void sayHello(String name) {

        before();
        greetingImpl.sayHello(name);
        after();

    }

//
    private void before() {
        System.out.println("直接使用代理的  Before");
    }

    private void after() {
        System.out.println("直接使用代理的  After");
    }


}
