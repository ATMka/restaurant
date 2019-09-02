package com.epam.extlab.restaurant.entity.dto;

import java.time.LocalDateTime;

public class Item {
    private long itemId;
    private long categoryId;
    private String name;
    private String description;
    private double coast;
    private String image;
    private int active;
    private LocalDateTime updateTime;

    public Item() {
    }

    public Item(long itemId, long categoryId, String name, String description, double coast, String image, int active, LocalDateTime updateTime) {
        this.itemId = itemId;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.coast = coast;
        this.image = image;
        this.active = active;
        this.updateTime = updateTime;
    }

    public Item(long categoryId, String name, String description, double coast, String image, int active, LocalDateTime update_time) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.coast = coast;
        this.image = image;
        this.active = active;
        this.updateTime = update_time;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
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

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", coast=" + coast +
                ", image='" + image + '\'' +
                ", active=" + active +
                ", updateTime=" + updateTime +
                '}';
    }
}
