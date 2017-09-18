package com.mmall.aspect;

import org.apache.log4j.Logger;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 日志处理类
 *
 * @author xyy
 * @create 2017-09-05 10:59
 **/
public class LogHandler {

    public static final Logger log = Logger.getLogger(LogHandler.class);
    public static final Logger controller = Logger.getLogger("controller");
    public static final Logger service = Logger.getLogger("service");
    public static final Logger dao = Logger.getLogger("dao");

    public static void LogDebug(String s) {
        log.debug(s);
    }

    public static void logInfo(String s) {
        log.info(s);
    }

    public static void logError(String s) {
        log.error(s);
    }

    public static void logError(String s, Exception e) {
        log.error(s, e);
    }

    public static void controllerLogDebug(String s) {
        controller.debug(s);
    }

    public static void controllerLogInfo(String s) {
        controller.info(s);
    }

    public static void controllerLogError(String s) {
        controller.error(s);
    }

    public static void controllerLogError(String s, Exception e) {
        controller.error(s, e);
    }

    public static void serviceLogDebug(String s) {
        service.debug(s);
    }

    public static void serviceLogInfo(String s) {
        service.info(s);
    }

    public static void serviceLogError(String s) {
        service.error(s);
    }

    public static void serviceLogError(String s, Exception e) {
        service.error(s, e);
    }

    public static void daoLogDebug(String s) {
        dao.debug(s);
    }

    public static void daoLogInfo(String s) {
        dao.info(s);
    }

    public static void daoLogError(String s) {
        dao.error(s);
    }

    public static void daoLogError(String s, Exception e) {
        dao.error(s, e);
    }


    public static void error(Logger logger, String s, Exception e) {
        logger.error(s, e);
    }

    public static void getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try {
            t.printStackTrace(pw);
            log.error(sw.toString());
        } finally {
            pw.close();
        }
    }


}
