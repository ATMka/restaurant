package com.epam.extlab.restaurant.entity.dto;

import java.time.LocalDateTime;

public class User {
    private long user_id;
    private int active;
    private String fullname;
    private String login;
    private String password;
    private boolean is_admin;
    private LocalDateTime update_time;

    public User() {
    }

    public User(long user_id, int active, String fullname, String login, String password, boolean is_admin, LocalDateTime update_time) {
        this.user_id = user_id;
        this.active = active;
        this.fullname = fullname;
        this.login = login;
        this.password = password;
        this.is_admin = is_admin;
        this.update_time = update_time;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
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

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", active=" + active +
                ", fullname='" + fullname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", is_admin=" + is_admin +
                ", update_time=" + update_time +
                '}';
    }
}
