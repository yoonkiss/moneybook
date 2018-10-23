package com.example.moneybook.exception;

public enum ErrorCode {
    DP_QUERY_ERROR(ErrorCodeConstants.INTERNAL_SERVER_ERROR, "mb.queryError", "DB query error occurs"),
    
    // End - 500
    DP_UNKNOWN_ERROR(ErrorCodeConstants.INTERNAL_SERVER_ERROR, "mb.unknownError", "Unknown error occurs");

    private int httpCode;
    private String code;
    private String message;

    ErrorCode(int httpCode, String code, String message) {
        this.httpCode = httpCode;
        this.code = code;
        this.message = message;
    }

    public int getHttpCode() {
        return this.httpCode;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}