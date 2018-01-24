//package com.mmall.aspect;
//
//import com.zhuoyue.common.util.ParamUtil;
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//import net.sf.json.util.JSONTokener;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//
///**
// * 日志记录AOP实现
// *
// * @author xyy
// * @create 2017-09-11 15:27
// **/
//@Aspect
//public class LogAspect {
//
////    static Logger logger = LogManager.getLogger(LogAspect.class);
//
//
//    private String requestPath = null;//请求地址
//
//
//
//    /**
//     * 设置切点
//     */
//    @Pointcut("execution(public * com.mmall.*.controller.win.*Controller.*(..))")
//    public void doPointcut(){
//    }
//
//
//    @Before("doPointcut()")
//    public void doBefore(JoinPoint joinPoint) {
//
//    }
//
//
//    @Before("doPointcut()")
//    public void doAfter(JoinPoint joinPoint) {
//
//    }
//
//
//    @Before("doPointcut()")
//    public void doAround(ProceedingJoinPoint pjp) {
//
//        //1.获取请求信息
//        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
//        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
//        HttpServletRequest request = sra.getRequest();
//
//        try {
//            byte buffer[] = ParamUtil.getRequestPostBytes(request);
//
//            String charEncoding = request.getCharacterEncoding();
//            if (charEncoding == null) {
//                charEncoding = "UTF-8";
//            }
//            String str = new String(buffer, charEncoding);
//
//            Object json = new JSONTokener(str).nextValue();
//            if(json instanceof JSONObject){
//                JSONObject jsonObject = (JSONObject)json;
//
//                //...
//            }else if (json instanceof JSONArray){
//                JSONArray jsonArray = (JSONArray)json;
//                //...
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//
//
//
//
//
//
//
//}
