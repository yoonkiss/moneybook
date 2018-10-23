package com.example.moneybook.exception;

import java.util.HashMap;
import java.util.Map;

public class MoneyBookException extends RuntimeException {
    protected static final String DEATIL_MESSAGE = "detailMessage";
    private static final long serialVersionUID = -2739156833589717194L;
    protected ErrorCode errCode = ErrorCode.DP_UNKNOWN_ERROR;
    protected Map<String, Object> info = new HashMap<>();

    public MoneyBookException() {
    }

    public MoneyBookException(ErrorCode errCode) {
        this.errCode = errCode;
    }

    public MoneyBookException(ErrorCode errCode, Throwable e) {
        super(e);
        this.errCode = errCode;
    }

    public MoneyBookException(Throwable e) {
        super(e);
    }

    public int getHttpCode() {
        return errCode.getHttpCode();
    }

    public String getCode() {
        return errCode.getCode();
    }

    public String getMessage() {
        return errCode.getMessage();
    }

    public void addInformation(String key, Object value) {
        info.put(key, value);
    }

    public Map<String, Object> getInformation() {
        return info;
    }

    public void setDetailMessage(String message) {
        addInformation(DEATIL_MESSAGE, message);
    }
}
