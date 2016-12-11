package com.alekea.model;

import java.util.List;

/**
 * Created by Fifi on 12/11/2016.
 */
public class MyResponse {
    private String message;
    private Object object;
    private List lstObject;

    public MyResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message,Object... object) {
        this.message = message;
        this.object = object;
    }
}
