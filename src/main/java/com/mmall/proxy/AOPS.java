package com.mmall.proxy;

import com.mmall.common.ResultBean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xyy
 * @create 2017-09-11 14:23
 **/


@Aspect
@Component
public class AOPS {



    @Around("execution(public com.mmall.common.ResultBean *(..))")
    public Object handlerControllerMethod(ProceedingJoinPoint pjp)  {

        long startTime = System.currentTimeMillis();

        ResultBean<?> result;

        try {
            System.out.println("环绕通知开始执行了");
            long start = System.currentTimeMillis();


            result = (ResultBean<?>) pjp.proceed();

            System.out.println("环绕通知执行结束了");
            long end = System.currentTimeMillis();
            System.out.println("执行业务方法共计：" + (end - start) + "毫秒。");
//            logger.info(pjp.getSignature() + "use time:" + (end - start));
        } catch (Throwable e) {
//            result = handlerException(pjp, e);
            result = null;
        }

        return result;
    }
}
