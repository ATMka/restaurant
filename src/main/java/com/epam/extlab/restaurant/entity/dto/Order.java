package com.epam.extlab.restaurant.entity.dto;

import java.time.LocalDateTime;

public class Order {
    private long order_id;
    private long user_id;
    private long order_number;
    private int active;
    private LocalDateTime update_time;

    public Order() {
    }

    public Order(long order_id, long user_id, long order_number, int active, LocalDateTime update_time) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.order_number = order_number;
        this.active = active;
        this.update_time = update_time;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getOrder_number() {
        return order_number;
    }

    public void setOrder_number(long order_number) {
        this.order_number = order_number;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", user_id=" + user_id +
                ", order_number=" + order_number +
                ", active=" + active +
                ", update_time=" + update_time +
                '}';
    }
}
