package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findCategories();
    void addCategory(Category category);
    void deleteCategoryById(Long id);}
