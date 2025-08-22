package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.Order;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);
    Long getTotalPriceByJoin(Long id);
    void updateOrderTotalPrice(Long id);
}