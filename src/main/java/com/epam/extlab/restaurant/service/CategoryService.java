package com.epam.extlab.restaurant.service;

import com.epam.extlab.restaurant.entity.dto.Category;
import com.epam.extlab.restaurant.repository.interfaces.ICategoryRepository;
import com.epam.extlab.restaurant.service.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public long addCategory(Category category){
        return categoryRepository.addCategory(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }

    @Override
    public Category getCategoryById(long categoryId){
        return categoryRepository.getCategoryById(categoryId);
    }

    @Override
    public int deleteCategoryById(long itemId){
        return categoryRepository.deleteCategoryById(itemId);
    }
}
