package com.shbak.kiosk.controller;

import com.shbak.kiosk.entity.Category;
import com.shbak.kiosk.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getCategories() {
        return categoryService.findCategories();
    }

    @PostMapping
    public void addCategory(@RequestBody Category addedData){
        categoryService.addCategory(addedData);
    }

    @DeleteMapping
    public void deleteCategory(@RequestBody Long id){
        categoryService.deleteCategoryById(id);
    }
}
