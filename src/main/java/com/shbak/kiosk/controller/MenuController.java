package com.shbak.kiosk.controller;

import com.shbak.kiosk.entity.Menu;
import com.shbak.kiosk.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public List<Menu> findMenuList() {
        return menuService.findMenu();
    }

    @PostMapping
    public void addMenu(@RequestBody Menu menu) {
        menuService.addMenu(menu);
    }

    @DeleteMapping
    public void deleteMenuById(@RequestBody Long id){
        menuService.deleteMenuById(id);
    }

}
