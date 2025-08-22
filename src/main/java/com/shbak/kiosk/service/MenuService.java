package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> findMenu();
    void addMenu(Menu menu);
    void deleteMenuById(Long id);
}
