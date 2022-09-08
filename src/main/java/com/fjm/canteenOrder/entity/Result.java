package com.fjm.canteenOrder.entity;

public class Result<T> {
    private static int SUCCESS_CODE = 200;
    private static String SUCCESS_MESSAGE = "请求成功";
    private int code;
    private String message;
    private T data;

    public static <T> Result success(T data) {
        Result<T> result = new Result<T>();
        result.setCode(SUCCESS_CODE);
        result.setMessage(SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
