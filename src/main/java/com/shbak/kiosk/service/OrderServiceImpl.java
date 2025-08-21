package com.shbak.kiosk.service;

import com.shbak.kiosk.model.Order;
import com.shbak.kiosk.repository.OrderItemMapper;
import com.shbak.kiosk.repository.OrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderMapper orderMapper;
    private final OrderItemMapper orderItemMapper;

    @Override
    public List<Order> findOrders(Order order) {
        return List.of();
    }

    @Override
    public Order findOrderById(Long id) {
        return null;
    }

    @Override
    public void addOrder(Order order) {
        orderMapper.addOrder(order);
    }

    @Override
    @Transactional
    public Long getTotalPriceByJoin(Long id) {
        Long totalPrice = orderMapper.getTotalPriceByJoin(id);
        log.info("{}", totalPrice);
        return totalPrice;
    }

    @Override
    @Transactional
    public void updateOrderTotalPrice(Long id){
        Long totalPrice = getTotalPriceByJoin(id);
        orderMapper.updateOrderTotalPrice(id, totalPrice);
    }
}
