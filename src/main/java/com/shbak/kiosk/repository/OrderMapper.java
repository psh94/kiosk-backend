package com.shbak.kiosk.repository;

import com.shbak.kiosk.entity.Order;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderMapper {

    void addOrder(Order order);
    Long getTotalPriceByJoin(Long id);
}