package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.Category;
import com.shbak.kiosk.repository.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryMapper categoryMapper;

    @Override
    @Transactional
    public List<Category> findCategories() {
        return categoryMapper.findCategories();
    }


    @Override
    @Transactional
    public void addCategory(Category category) {
        categoryMapper.addCategory(category);
    }

    @Override
    @Transactional
    public void deleteCategoryById(Long id) {
        categoryMapper.deleteCategoryById(id);
    }
}