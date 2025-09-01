package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.Category;
import com.shbak.kiosk.repository.CategoryMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
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
        // 카테고리 이름으로 중복 조회
        if (categoryMapper.checkDuplicateCategoryByName(category.name)){
            throw new IllegalArgumentException("이미 존재하는 카테고리입니다.");
        }
        categoryMapper.addCategory(category);
    }

    @Override
    @Transactional
    public void deleteCategoryById(Long id) {
        categoryMapper.deleteCategoryById(id);
    }
}