package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.Order;
import com.shbak.kiosk.entity.OrderItem;
import com.shbak.kiosk.repository.OrderItemMapper;
import com.shbak.kiosk.repository.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderMapper orderMapper;
    private final OrderItemService orderItemService;

    @Override
    @Transactional
    public void addOrder(List<OrderItem> orderItems) {
        Order order = new Order();
        orderMapper.addOrder(order);
        orderItemService.addOrderItems(orderItems , order.getId());
    }

    @Override
    @Transactional
    public Long getTotalPriceByJoin(Long id) {
        return orderMapper.getTotalPriceByJoin(id);
    }

}
