package com.alekea.model;

/**
 * Created by Prince on 23.11.2016.
 */
public class Clientz {
    private int id;
    private String token;
    private long dated;

    public Clientz(String token){
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

    public long getDated() {
        return dated;
    }

    public void setDated(long dated) {
        this.dated = dated;
    }
}
