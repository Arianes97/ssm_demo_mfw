package com.chixing.common;

public enum ResultStatus {


    SUCCESS("success"),
    FAIL("fail"),
    ERROR("error"),
    NEED_LOGIN("need_login"),
    HAS_LOGIN("has_log");


    private String value;
    ResultStatus(String value){
        this.value = value;
    }
}
