package com.alekea.model;

/**
 * Created by Prince on 23.11.2016.
 */
public class Talk {
    private String subject;
    private String technology;
    private String notes;
    private long dated;

    public Talk() {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getDated() {
        return dated;
    }

    public void setDated(long dated) {
        this.dated = dated;
    }
}
