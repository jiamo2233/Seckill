package com.jiamo.seckill.result;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Result <T>{
    private int code;
    private String msg;
    private T data;
    //判断是否相等
    public boolean isSuccess(){
        return this.code==CodeMsg.SUCCESS.getCode();
    }
    //成功的时候，返回结果
    public static <T> Result<T> success(T data){
        return new Result(data);
    }

    private Result(T data) {
        this.code=CodeMsg.SUCCESS.getCode();
        this.msg=CodeMsg.SUCCESS.getMsg();
        this.data=data;
    }

    //失败的时候返回具体错误msg提示
    public  static  Result error(CodeMsg codeMsg){
        return new Result(codeMsg);
    }
    private Result(CodeMsg codeMsg){
        this.code=codeMsg.getCode();
        this.msg=codeMsg.getMsg();
    }


}
