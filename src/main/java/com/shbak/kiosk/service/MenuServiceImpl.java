package com.shbak.kiosk.service;

import com.shbak.kiosk.model.Menu;
import com.shbak.kiosk.repository.MenuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{

    private final MenuMapper menuMapper;

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
