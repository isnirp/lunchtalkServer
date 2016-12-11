package com.alekea.model;

/**
 * Created by Prince on 23.11.2016.
 */
public class Talk {
    private String subject;
    private String tech;
    private String notes;

    public Talk(String subject,String tech,String notes) {
        this.subject = subject;
        this.tech = tech;
        this.notes = notes;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
