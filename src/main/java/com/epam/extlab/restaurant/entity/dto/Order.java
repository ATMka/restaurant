package com.epam.extlab.restaurant.entity.dto;

import java.time.LocalDateTime;

public class Order {
    private long orderId;
    private long userId;
    private long orderNumber;
    private int active;
    private LocalDateTime updateTime;

    public Order() {
    }

    public Order(long orderId, long userId, long orderNumber, int active, LocalDateTime updateTime) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderNumber = orderNumber;
        this.active = active;
        this.updateTime = updateTime;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", orderNumber=" + orderNumber +
                ", active=" + active +
                ", updateTime=" + updateTime +
                '}';
    }
}
