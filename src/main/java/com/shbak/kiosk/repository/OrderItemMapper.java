package com.shbak.kiosk.repository;

import com.shbak.kiosk.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {

    List<OrderItem> findOrderItems(OrderItem orderItem);
    OrderItem findOrderItemById(Long id);
    void addOrderItem(OrderItem orderItem);
}
