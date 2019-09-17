package com.epam.extlab.restaurant.entity.dto;

import java.time.LocalDateTime;

public class User {
    private long userId;
    private int active;
    private String fullname;
    private String login;
    private String password;
    private boolean isAdmin;
    private LocalDateTime updateTime;

    public User() {
    }

    public User(long user_id, int active, String fullname, String login, String password, boolean is_admin, LocalDateTime update_time) {
        this.userId = user_id;
        this.active = active;
        this.fullname = fullname;
        this.login = login;
        this.password = password;
        this.isAdmin = is_admin;
        this.updateTime = update_time;
    }

    public User(int active, String fullname, String login, String password, boolean is_admin, LocalDateTime update_time) {
        this.active = active;
        this.fullname = fullname;
        this.login = login;
        this.password = password;
        this.isAdmin = is_admin;
        this.updateTime = update_time;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        this.isAdmin = admin;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", active=" + active +
                ", fullname='" + fullname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", updateTime=" + updateTime +
                '}';
    }
}
