package com.shbak.kiosk.repository;

import com.shbak.kiosk.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {

    void addOrderItem(OrderItem orderItems);
}