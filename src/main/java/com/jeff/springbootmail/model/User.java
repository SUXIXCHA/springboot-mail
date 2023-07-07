package com.jeff.springbootmail.model;

import java.util.Date;

public class User {
    private Integer userId;
    private String email;
    private String password;
    private Date createdDate;
    private Date lateModifiedDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLateModifiedDate() {
        return lateModifiedDate;
    }

    public void setLateModifiedDate(Date lateModifiedDate) {
        this.lateModifiedDate = lateModifiedDate;
    }
}
