package com.alekea.model;

/**
 * Created by Fifi on 4/12/2017.
 * <p>
 * Creates and publishes lunch talk
 */
public class User {
    private String userName;
    private String position;

    public User(String userName, String position) {
        this.userName = userName;
        this.position = position;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
