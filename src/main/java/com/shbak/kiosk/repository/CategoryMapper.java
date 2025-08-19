package com.shbak.kiosk.repository;

import com.shbak.kiosk.model.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> findCategories();
    Category findCategoryById(Long id);
    void addCategory(Category category);
    void deleteCategoryById(Long id);
}
