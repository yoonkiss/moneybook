package com.example.moneybook.exception;

import org.springframework.http.HttpStatus;

public class ErrorCodeConstants {
    // HTTP error
    public static final int OK = HttpStatus.OK.value();
    public static final int BAD_REQUEST = HttpStatus.BAD_REQUEST.value();
    public static final int UNAUTHORIZED = HttpStatus.UNAUTHORIZED.value();
    public static final int NOT_FOUND = HttpStatus.NOT_FOUND.value();
    public static final int METHOD_NOT_ALLOWED = HttpStatus.METHOD_NOT_ALLOWED.value();
    public static final int CONFLICT = HttpStatus.CONFLICT.value();
    public static final int INTERNAL_SERVER_ERROR = HttpStatus.INTERNAL_SERVER_ERROR.value();
    public static final int SERVICE_UNAVAILABLE = HttpStatus.SERVICE_UNAVAILABLE.value();
    public static final int PRECONDITION_FAILED = HttpStatus.PRECONDITION_FAILED.value();

    // DB error
    public static final int QUERY_FAILED = 1001;
    public static final int ENTITY_NOT_FOUND = 1001;
}
