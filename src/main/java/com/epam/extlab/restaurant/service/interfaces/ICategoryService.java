package com.epam.extlab.restaurant.service.interfaces;

import com.epam.extlab.restaurant.entity.dto.Category;

import java.util.List;

public interface ICategoryService {
    long addCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(long id);

    int deleteCategoryById(long id);
}
