package com.mmall.proxy;

import com.mmall.common.ResultBean;
import org.springframework.stereotype.Component;

/**
 * @author xyy
 * @create 2017-09-11 14:28
 **/
@Component
public class GreetingImpl1 implements Greeting1 {

    public ResultBean<Boolean> sayHello1(String name) {
//        before();

//        throw new RuntimeException("Error"); // 故意抛出一个异常，看看异常信息能否被拦截到
//        after();
        System.out.println("Hello! " + name);

        return new ResultBean<Boolean>();
    }

}
