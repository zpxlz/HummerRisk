package com.hummer.common.core.handler;


import com.hummer.common.core.exception.HRException;
import com.hummer.common.core.service.ResultHolder;
import org.apache.shiro.ShiroException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestControllerAdvice
public class RestControllerExceptionHandler {
    /*=========== Shiro 异常拦截==============*/
    @ExceptionHandler(ShiroException.class)
    public ResultHolder exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        return ResultHolder.error(exception.getMessage());
    }


    @ExceptionHandler(HRException.class)
    public ResultHolder msExceptionHandler(HttpServletRequest request, HttpServletResponse response, HRException e) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResultHolder.error(e.getMessage());
    }
}