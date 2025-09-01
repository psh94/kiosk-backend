package com.shbak.kiosk.repository;

import com.shbak.kiosk.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> findCategories();
    void addCategory(Category category);
    void deleteCategoryById(Long id);
    boolean checkDuplicateCategoryByName(String name);
}
