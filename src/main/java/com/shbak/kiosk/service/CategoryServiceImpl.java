package com.shbak.kiosk.service;

import com.shbak.kiosk.model.Category;
import com.shbak.kiosk.repository.CategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<Category> findCategories() {
        return categoryMapper.findCategories();
    }

    @Override
    public Category findCategoryById(Long id) {
        return categoryMapper.findCategoryById(id);
    }

    @Override
    public void addCategory(Category category) {
        categoryMapper.addCategory(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryMapper.deleteCategoryById(id);
    }
}
