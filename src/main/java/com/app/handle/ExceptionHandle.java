package com.app.handle;

import com.app.enums.ResultEnums;
import com.app.exception.MyException;
import com.app.util.RestResult;
import com.app.util.ResultUtils;
import com.sun.org.apache.regexp.internal.RE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.transform.Result;

@ControllerAdvice
public class ExceptionHandle {
    Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public RestResult handle(Exception e) {
        if(e instanceof MyException){
            MyException myException = (MyException) e;
            return  ResultUtils.error(myException.getCode(),myException.getMessage());
        }else {
            logger.error("代码错误={}",e);
            ResultEnums enums = ResultEnums.UNKOWN_ERROR;
            return ResultUtils.error(enums.getCode(),enums.getMsg());
        }
    }
}
