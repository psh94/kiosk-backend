package com.shbak.kiosk.controller;

import com.shbak.kiosk.model.Menu;
import com.shbak.kiosk.service.MenuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public List<Menu> findMenus() {
        return menuService.findMenu();
    }

    @PostMapping
    public void addMenu(Menu menu) {
        menuService.addMenu(menu);
    }

    @DeleteMapping
    public void deleteMenuById(Long id){
        menuService.deleteMenuById(id);
    }

}
