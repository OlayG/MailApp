package com.example.mailapp.model;

import java.util.Calendar;

public class Email {
    private String sender;
    private Calendar date;
    private String subject;
    private String body;

    public Email(String sender, Calendar date, String subject, String body) {
        this.sender = sender;
        this.date = date;
        this.subject = subject;
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
