package com.epam.extlab.restaurant.entity.dto;

import java.time.LocalDateTime;

public class Category {
    private long categoryId;
    private Long parentId;
    private String name;
    private String description;
    private int active;
    private LocalDateTime updateTime;

    public Category() {
    }

    public Category(Long parentId, String name, String description, int active, LocalDateTime updateTime) {
        this.parentId = parentId;
        this.name = name;
        this.description = description;
        this.active = active;
        this.updateTime = updateTime;
    }

    public Category(long categoryId, Long parentId, String name, String description, int active, LocalDateTime updateTime) {
        this.categoryId = categoryId;
        this.parentId = parentId;
        this.name = name;
        this.description = description;
        this.active = active;
        this.updateTime = updateTime;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
        return "Category{" +
                "categoryId=" + categoryId +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                ", updateTime=" + updateTime +
                '}';
    }
}
