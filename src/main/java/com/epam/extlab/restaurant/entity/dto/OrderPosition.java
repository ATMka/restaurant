package com.epam.extlab.restaurant.entity.dto;

import java.time.LocalDateTime;

public class OrderPosition {
    private long position_id;
    private long order_id;
    private long item_id;
    private double coast;
    private int active;
    private LocalDateTime update_time;

    public OrderPosition() {
    }

    public OrderPosition(long position_id, long order_id, long item_id, double coast, int active, LocalDateTime update_time) {
        this.position_id = position_id;
        this.order_id = order_id;
        this.item_id = item_id;
        this.coast = coast;
        this.active = active;
        this.update_time = update_time;
    }

    public long getPosition_id() {
        return position_id;
    }

    public void setPosition_id(long position_id) {
        this.position_id = position_id;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
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

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "OrderPosition{" +
                "position_id=" + position_id +
                ", order_id=" + order_id +
                ", item_id=" + item_id +
                ", coast=" + coast +
                ", active=" + active +
                ", update_time=" + update_time +
                '}';
    }
}
