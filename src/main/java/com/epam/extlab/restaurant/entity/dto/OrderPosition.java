package com.epam.extlab.restaurant.entity.dto;

import java.time.LocalDateTime;

public class OrderPosition {
    private long positionId;
    private long orderId;
    private long itemId;
    private double coast;
    private int active;
    private LocalDateTime updateTime;

    public OrderPosition() {
    }

    public OrderPosition(long positionId, long orderId, long itemId, double coast, int active, LocalDateTime updateTime) {
        this.positionId = positionId;
        this.orderId = orderId;
        this.itemId = itemId;
        this.coast = coast;
        this.active = active;
        this.updateTime = updateTime;
    }

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
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
        return "OrderPosition{" +
                "positionId=" + positionId +
                ", orderId=" + orderId +
                ", itemId=" + itemId +
                ", coast=" + coast +
                ", active=" + active +
                ", updateTime=" + updateTime +
                '}';
    }
}
