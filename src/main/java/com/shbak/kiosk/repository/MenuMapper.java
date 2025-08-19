package com.shbak.kiosk.repository;

import com.shbak.kiosk.model.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> findMenu();
    Menu findMenuById(Long id);
    void addMenu(Menu menu);
    void deleteMenuById(Long id);
}
