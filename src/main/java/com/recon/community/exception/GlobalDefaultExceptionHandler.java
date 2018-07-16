package com.recon.community.exception;

import com.recon.core.vo.OptResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author caijun
 * @create 2017-12-26 15:49
 * @desc 全局异常捕获
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object defaultErrorHandler(HttpServletRequest req, Exception e) {
        OptResult result = new OptResult();
        result.fail(e.getMessage());
        e.printStackTrace();
        return result;
    }

    @ExceptionHandler(value = InvalidException.class)
    @ResponseBody
    public Object invalidExceptionHandler(HttpServletRequest req, InvalidException e) {
        OptResult result = new OptResult();
        result.fail((String) e.getMsg());
        return result;
    }

}
