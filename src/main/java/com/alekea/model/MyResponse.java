package com.alekea.model;

import java.util.List;

/**
 * Created by Fifi on 12/11/2016.
 */
public class MyResponse {
    private String message;
    private Object data;

    public MyResponse(String message) {
        this.message = message;
    }

    public MyResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
}
