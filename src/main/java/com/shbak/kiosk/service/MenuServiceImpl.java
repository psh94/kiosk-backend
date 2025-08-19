package com.shbak.kiosk.service;

import com.shbak.kiosk.model.Menu;
import com.shbak.kiosk.repository.MenuMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    private final MenuMapper menuMapper;

    public MenuServiceImpl(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    @Override
    public List<Menu> findMenu() {
        return menuMapper.findMenu();
    }

    @Override
    public Menu findMenuById(Long id) {
        return menuMapper.findMenuById(id);
    }

    @Override
    public void addMenu(Menu menu) {
        menuMapper.addMenu(menu);
    }

    @Override
    public void deleteMenuById(Long id) {
        menuMapper.deleteMenuById(id);
    }
}
