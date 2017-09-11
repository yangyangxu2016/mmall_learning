package com.mmall.proxy;

import com.mmall.service.IUserService;
import com.mmall.service.impl.UserServiceImpl;
import org.springframework.aop.framework.ProxyFactory;

/**
 * https://my.oschina.net/huangyong/blog/161338(AOP 那点事儿)
 * @author xyy
 * @create 2017-09-11 9:36
 **/
public class Client {

    public static void main(String[] args) {

//          直接使用代理
//        IUserServiceProxy userServiceProxy = new IUserServiceProxy(new UserServiceImpl()
//        );
//        userServiceProxy.selectQuestion("");
//

//        使用JDK动态代理
//        IUserService iUserService = new JDKDynamicProxy(new UserServiceImpl()).getProxy();
//        iUserService.selectQuestion("");


//      使用CGLib动态地理
//        IUserService iUserService1 = CGLibDynamicProxy.getInstance().getProxy(UserServiceImpl.class);
//        iUserService1.selectQuestion("");

//        使用AOP,编程式
        ProxyFactory proxyFactory = new ProxyFactory();//创建代理工厂
        proxyFactory.setTarget(new UserServiceImpl());//射入目标类对象
        proxyFactory.addAdvice(new GreetingBeforeAdvice());//添加前置增强

        IUserService iUserService2 = (IUserService) proxyFactory.getProxy();// 从代理工厂中获取代理
        iUserService2.selectQuestion("");// 调用代理的方法




    }
}
