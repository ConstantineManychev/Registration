package com.ConstantineManychev.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Constantine on 23.05.2015.
 */
public class Users {

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private String name;
    private String password;
    private String role;
    private String regdate;
    Date date = new Date();
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy.MM.dd");

    public Users(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
        regdate = dateformat.format(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRegDate() {
        return regdate;
    }

    public void setRegDate(String regdate) {
        this.regdate = regdate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
