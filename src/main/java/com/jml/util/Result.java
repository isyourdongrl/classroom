package com.jml.util;

public class Result<T> {

    //返回信息码
    private String code;
    //返回信息
    private String msg;
    //返回数据
    T data;

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }


    //成功，只返回成功码和信息
    public Result<T> success() {
        Result<T> result = new Result<>();
        result.setCode(ResultCode.SUCCESS.code);
        result.setMsg(ResultCode.SUCCESS.msg);
        return result;
    }

    //成功，返回成功码、信息和数据
    public Result<T> success(T data) {
        Result<T> result = new Result();
        result.setCode(ResultCode.SUCCESS.code);
        result.setMsg(ResultCode.SUCCESS.msg);
        result.setData(data);
        return result;
    }

    //失败，返回自己定义的信息码和信息
    public Result<T> error() {
        Result<T> result = new Result<>();
        result.setCode(ResultCode.ERROR.code);
        result.setMsg(ResultCode.ERROR.code);
        return result;
    }

    //失败，返回controller层传过来信息码和信息
    public Result<T> error(String code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

