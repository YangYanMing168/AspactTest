package com.app.exception;

import com.app.enums.ResultEnums;

/**
 * 只能继承 RuntimeException 这样才可以进行抛异常
 */
public class MyException extends RuntimeException {
private Integer code;

    public MyException(ResultEnums resultEnums) {
        super(resultEnums.getMsg());
        this.code = resultEnums.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
