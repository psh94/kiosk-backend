package com.shbak.kiosk.repository;

import com.shbak.kiosk.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> findMenu();
    void addMenu(Menu menu);
    void deleteMenuById(Long id);
    boolean checkDuplicateMenuByName(String name);
}
