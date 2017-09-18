package com.mmall.proxy;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 14258 on 2017/9/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-applicationContext.xml"})
public class GreetingImplTest {


    @Resource
    private  GreetingImpl1 greeting;

    @org.junit.Test
    public void testSayHello() throws Exception {


        greeting. sayHello1("java" + "");




    }
}