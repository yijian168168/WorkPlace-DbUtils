package com.myutils;

/**
 * 数据库异常
 * @Author: ZhangQingrong
 * @Date : 2017/7/28 10:06
 */
public class DatabaseException extends RuntimeException {

    /**
     * 错误码
     * */
    private String errorCode;
    /**
     * 错误描述
     * */
    private String errorMsg;

    public DatabaseException(String errorCode, String errorMsg,Throwable cause) {
        super(getErrorMsg(errorCode,errorMsg),cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    private static String getErrorMsg(String errorCode, String errorMsg){
        return "errorCode: " + errorCode + ", errorMsg: " + errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
