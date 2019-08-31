package com.epam.extlab.restaurant.entity.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "Categories")
public class Category {
    @Id
    private long category_id;
    private long subcategory_id;
    private String name;
    private String description;
    private int active;
    private LocalDateTime update_time;

    public Category() {
    }

    public Category(long category_id, long subcategory_id, String name, String description, int active, LocalDateTime update_time) {
        this.category_id = category_id;
        this.subcategory_id = subcategory_id;
        this.name = name;
        this.description = description;
        this.active = active;
        this.update_time = update_time;
    }

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    public long getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(long subcategory_id) {
        this.subcategory_id = subcategory_id;
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

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", subcategory_id=" + subcategory_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                ", update_time=" + update_time +
                '}';
    }
}
