package com.epam.extlab.restaurant.entity.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class User {
    private long userId;
    private int active = 1;
    private String fullname;

    @NotEmpty(message="Логин должен быть заполнен")
    @Size(min = 3, message="Логин должен быть длиннее 3 символов")
    private String login;

    @NotEmpty(message="Пароль должен быть заполнен")
    @Size(min = 3, message="Пароль должен быть длиннее 3 символов")
    private String password;


    private boolean isAdmin;
    private LocalDateTime updateTime = LocalDateTime.now();

    public User() {
    }

    public User(long user_id, int active, String fullname,
                @NotEmpty(message="Логин должен быть заполнен")
                @Size(min = 3, message="Логин должен быть длиннее 3 символов")String login,
                @NotEmpty(message="Пароль должен быть заполнен")
                @Size(min = 3, message="Пароль должен быть длиннее 3 символов") String password,
                boolean is_admin, LocalDateTime update_time) {
        this.userId = user_id;
        this.active = active;
        this.fullname = fullname;
        this.login = login;
        this.password = password;
        this.isAdmin = is_admin;
        this.updateTime = update_time;
    }

    public User(int active, String fullname,
                @NotEmpty(message="Логин должен быть заполнен")
                @Size(min = 3, message="Логин должен быть длиннее 3 символов")String login,
                @NotEmpty(message="Пароль должен быть заполнен")
                @Size(min = 3, message="Пароль должен быть длиннее 3 символов") String password,
                boolean is_admin, LocalDateTime update_time) {
        this.active = active;
        this.fullname = fullname;
        this.login = login;
        this.password = password;
        this.isAdmin = is_admin;
        this.updateTime = update_time;
    }

    public User(
            @NotEmpty(message="Логин должен быть заполнен")
            @Size(min = 3, message="Логин должен быть длиннее 3 символов")String login,
            @NotEmpty(message="Пароль должен быть заполнен")
            @Size(min = 3, message="Пароль должен быть длиннее 3 символов") String password) {
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
