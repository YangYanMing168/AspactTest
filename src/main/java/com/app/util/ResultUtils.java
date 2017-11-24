package com.app.util;

public class ResultUtils {
    public static RestResult success(Object data){
        RestResult restResult = new RestResult();
        restResult.setCode(1);
        restResult.setMsg("成功");
        restResult.setData(data);
        return restResult;
    }
    public static RestResult success(){
        return success(null);
    }
    public static RestResult error(Integer code,String msg){
        RestResult restResult = new RestResult();
        restResult.setCode(code);
        restResult.setMsg(msg);
        return restResult;
    }
}
