package com.alekea.model;

import java.util.List;

/**
 * Created by Fifi on 12/11/2016.
 */
public class MyResponse {
    private String msg;
    private Object data;
    private List<Object> lstdata;

    public MyResponse(String msg) {
        this.msg = msg;
    }

    public MyResponse(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }
}
