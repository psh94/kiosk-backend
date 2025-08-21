package com.shbak.kiosk.service;

import com.shbak.kiosk.model.OrderItem;

import java.util.List;

public interface OrderItemService {
    List<OrderItem> findOrderItems(OrderItem orderItem);
    List<OrderItem> findOrderItemsByOrderId(Long id);
    OrderItem findOrderItemById(Long id);
    void addOrderItem(OrderItem orderItem);
}
