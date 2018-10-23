package com.example.moneybook.common;

import lombok.Data;

@Data
public class ResponseData {
    private Status status = Status.SUCCESS;
    private String code;
    private String message;
    private Object data;

    enum Status {
        SUCCESS("success"), FAIL("fail");
        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }

    public ResponseData() {
        this(Status.SUCCESS, null, null, null);
    }

    public ResponseData(Object data) {
        this(Status.SUCCESS, null, null, data);
    }

    public ResponseData(String code, String message, Object data) {
        this(Status.FAIL, code, message, data);
    }

    public ResponseData(Status status, String code, String message, Object data) {
        this.setStatus(status);
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }
}
