package com.shbak.kiosk.service;

import com.shbak.kiosk.model.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> findMenu();
    Menu findMenuById(Long id);
    void addMenu(Menu menu);
    void deleteMenuById(Long id);
}
