package com.mmall.service;

import com.mmall.proxy.IUserServiceProxy;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 14258 on 2017/9/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-applicationContext.xml"})
public class IUserServiceTest {

    @Resource
    private IUserServiceProxy userServiceProxy;

    @org.junit.Test
    public void testSelectQuestion() throws Exception {
        userServiceProxy.selectQuestion( "");
    }
}