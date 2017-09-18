package com.mmall.aspect;


import com.mmall.common.ResultBean;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author xyy
 * @create 2017-09-08 16:38
 **/
@Aspect
@Component
public class ControllerAOP {


    private static final Logger logger = LogManager.getLogger(ControllerAOP.class);

    @Around("execution(public com.zhuoyue.common.util.ResultBean *(..))")
    public Object handlerControllerMethod(ProceedingJoinPoint pjp)  {

        ResultBean<?> result;

        try {
            System.out.println("环绕通知开始执行了");
            long start = System.currentTimeMillis();
            result = (ResultBean<?>) pjp.proceed();

            System.out.println("环绕通知执行结束了");
            long end = System.currentTimeMillis();
            System.out.println("执行业务方法共计：" + (end - start) + "毫秒。");
            logger.info(pjp.getSignature() + "use time:" + (end - start));
        } catch (Throwable e) {
            result = handlerException(pjp, e);
        }

        return result;
    }

    private ResultBean<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
        ResultBean<?> result = new ResultBean();

        // 已知异常
        if (e instanceof CheckException) {
            result.setMsg(e.getLocalizedMessage());
            result.setCode(ResultBean.FAIL);
        } else {
            logger.error(pjp.getSignature() + " error ", e);

            result.setMsg(e.toString());
            result.setCode(ResultBean.FAIL);

            // 未知异常是应该重点关注的，这里可以做其他操作，如通知邮件，单独写到某个文件等等。
        }

        return result;
    }

}
