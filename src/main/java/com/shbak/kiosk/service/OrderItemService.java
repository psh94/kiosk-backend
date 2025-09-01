package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.OrderItem;

import java.util.List;

public interface OrderItemService {

    void addOrderItems(List<OrderItem> orderItems, Long orderId);
}
