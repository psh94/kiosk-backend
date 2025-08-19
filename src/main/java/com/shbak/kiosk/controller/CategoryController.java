package com.shbak.kiosk.controller;

import com.shbak.kiosk.model.Category;
import com.shbak.kiosk.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

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
