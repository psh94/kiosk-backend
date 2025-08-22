package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.Menu;
import com.shbak.kiosk.repository.MenuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{

    private final MenuMapper menuMapper;

    @Override
    @Transactional
    public List<Menu> findMenu() {
        return menuMapper.findMenu();
    }


    @Override
    @Transactional
    public void addMenu(Menu menu) {
        menuMapper.addMenu(menu);
    }

    @Override
    @Transactional
    public void deleteMenuById(Long id) {
        menuMapper.deleteMenuById(id);
    }
}
