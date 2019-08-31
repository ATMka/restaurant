package com.epam.extlab.restaurant.entity.dto;

import java.time.LocalDateTime;

public class Item {
    private long item_id;
    private long category_id;
    private String name;
    private String description;
    private double coast;
    private String image;
    private int active;
    private LocalDateTime update_time;

    public Item() {
    }

    public Item(long item_id, long category_id, String name, String description, double coast, String image, int active, LocalDateTime update_time) {
        this.item_id = item_id;
        this.category_id = category_id;
        this.name = name;
        this.description = description;
        this.coast = coast;
        this.image = image;
        this.active = active;
        this.update_time = update_time;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
        return "Item{" +
                "item_id=" + item_id +
                ", category_id=" + category_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", coast=" + coast +
                ", image='" + image + '\'' +
                ", active=" + active +
                ", update_time=" + update_time +
                '}';
    }
}
