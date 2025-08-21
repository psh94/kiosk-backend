package com.shbak.kiosk.repository;

import com.shbak.kiosk.model.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> findOrders(Order order);
    Order findOrderById(Long id);
    void addOrder(Order order);
    Long getTotalPriceByJoin(Long id);
    void updateOrderTotalPrice(Long id, Long totalPrice);
}