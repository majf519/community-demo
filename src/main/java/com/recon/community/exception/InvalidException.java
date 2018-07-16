package com.recon.community.exception;

/**
 * @author caijun
 * @create 2017-12-27 17:00
 * @desc ${DESCRIPTION}
 */
public class InvalidException extends RuntimeException{

    private Object msg;

    public InvalidException(Object msg) {
        this.msg = msg;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
}
