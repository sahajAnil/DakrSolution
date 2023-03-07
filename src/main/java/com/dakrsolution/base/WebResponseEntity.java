package com.dakrsolution.base;

import lombok.Data;
import org.json.JSONObject;

@Data
public class WebResponseEntity<T> {

    private int status;

    private boolean flag;

    private String message;

    private Object response;

    private JSONObject otherInfo;

    public WebResponseEntity(int status, boolean flag, String message, Object response, JSONObject otherInfo) {
        this.status = status;
        this.flag = flag;
        this.message = message;
        this.response = response;
        this.otherInfo = otherInfo;
    }

    public WebResponseEntity(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public WebResponseEntity(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public WebResponseEntity(boolean flag, Object response) {
        this.flag = flag;
        this.response = response;
    }

    public WebResponseEntity(boolean flag, String message, Object response) {
        this.flag = flag;
        this.message = message;
        this.response = response;
    }

    public WebResponseEntity(int status, boolean flag, String message, JSONObject otherInfo) {
        this.status = status;
        this.flag = flag;
        this.message = message;
        this.otherInfo = otherInfo;
    }
}
