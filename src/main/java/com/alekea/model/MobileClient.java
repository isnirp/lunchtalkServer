package com.alekea.model;

/**
 * Created by Prince on 23.11.2016.
 */
public class MobileClient {
    private int id;
    private String token;


    public MobileClient(String token){
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
