package com.mmall.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://my.oschina.net/huangyong/blog/161338(AOP 那点事儿)
 * @author xyy
 * @create 2017-09-11 9:36
 **/
public class Client {

    public static void main(String[] args) {


//          直接使用代理
//        Greeting greetingProxy = new GreetingProxy(new GreetingImpl());
//        greetingProxy.sayHello("Jack");


//        使用JDK动态代理
//        Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
//        greeting.sayHello("jack");


//      使用CGLib动态地理
//        Greeting greeting = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
//        greeting.sayHello("jack");


//        使用AOP编程式
//        ProxyFactory proxyFactory = new ProxyFactory();//创建代理工厂
//        proxyFactory.setTarget(new GreetingImpl());//射入目标类对象
//        proxyFactory.addAdvice(new GreetingBeforeAdvice());//添加前置增强
//        proxyFactory.addAdvice(new GreetingAfterAdvice());  // 添加后置增强
//
//        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());  // 添加前置和后置增强
//
//        proxyFactory.addAdvice(new GreetingAroundAdvice()); //环绕增强
//
//
//        Greeting greeting = (Greeting) proxyFactory.getProxy(); // 从代理工厂中获取代理        iUserService2.selectQuestion("");// 调用代理的方法
//        greeting.sayHello("Jack");                              // 调用代理的方法


        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-applicationContext.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxy");
        greeting.sayHello("java");


    }
}
