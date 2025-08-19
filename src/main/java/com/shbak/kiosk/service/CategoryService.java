package com.shbak.kiosk.service;

import com.shbak.kiosk.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findCategories();
    Category findCategoryById(Long id);
    void addCategory(Category category);
    void deleteCategoryById(Long id);
}
