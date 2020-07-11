package com.kakite.exception;

public enum MyHttpStatus implements MyHttpStatusCode {
    SYSTEM_ERROR(4004, "服务器异常错误");

    private Integer code;
    private String message;

    MyHttpStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public Integer getCode() {
        return null;
    }
}
