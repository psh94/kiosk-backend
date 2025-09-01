package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.Order;
import com.shbak.kiosk.entity.OrderItem;

import java.util.List;

public interface OrderService {

    void addOrder(List<OrderItem> orderItems);
    Long getTotalPriceByJoin(Long id);
}