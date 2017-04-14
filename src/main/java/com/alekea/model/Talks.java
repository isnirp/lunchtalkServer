package com.alekea.model;

/**
 * Created by Fifi on 4/12/2017.
 * <p>
 * Discussions published by a user
 */
public class Talks {
    private String subject;
    private String talk;
    private User user;

    public Talks() {
    }
    public Talks(String subject,String talk,User user) {
        this.subject = subject;
        this.talk = talk;
        this.user = user;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
