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
        if(menu == null){
            throw new IllegalArgumentException("menu가 null입니다.");
        }
        if (menuMapper.checkDuplicateMenuByName(menu.name)){
            throw new IllegalArgumentException("이미 존재하는 메뉴입니다.");
        }
        menuMapper.addMenu(menu);
    }

    @Override
    @Transactional
    public void deleteMenuById(Long id) {
        menuMapper.deleteMenuById(id);
    }
}
