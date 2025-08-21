package com.shbak.kiosk.service;

import com.shbak.kiosk.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> findOrders(Order order);
    Order findOrderById(Long id);
    void addOrder(Order order);
    Long getTotalPriceByJoin(Long id);
    void updateOrderTotalPrice(Long id);
}