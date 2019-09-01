package com.epam.extlab.restaurant.repository.interfaces;

import com.epam.extlab.restaurant.entity.dto.Category;

import java.util.List;

public interface ICategoryRepository {
    long addCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(long id);

    int deleteCategoryById(long id);
}
