package com.mmall.common;

import java.io.Serializable;

/**
 * @author xyy
 * @create 2017-09-08 16:40
 **/
public class ResultBean<T> implements Serializable {


    private static final long serialVersionUID = 5170581363889094766L;

    public static final int SUCCESS = 0;

    public static final int FAIL = 1;

    public static final int NO_PERMISSION = 2;

    private String msg = "success";

    private int code = SUCCESS;

    private T data;

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        super();
        this.data = data;
    }

    public ResultBean(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = FAIL;
    }

    public String getMsg() {
        return msg;
    }

    public ResultBean setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public int getCode() {
        return code;
    }

    public ResultBean setCode(int code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultBean setData(T data) {
        this.data = data;
        return this;
    }
}

