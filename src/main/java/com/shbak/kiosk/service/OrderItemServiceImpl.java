package com.shbak.kiosk.service;

import com.shbak.kiosk.model.OrderItem;
import com.shbak.kiosk.repository.OrderItemMapper;
import com.shbak.kiosk.repository.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItem> findOrderItems(OrderItem orderItem) {
        return List.of();
    }

    @Override
    public List<OrderItem> findOrderItemsByOrderId(Long id) {
        return List.of();
    }

    @Override
    public OrderItem findOrderItemById(Long id) {
        return null;
    }

    @Override
    public void addOrderItem(OrderItem orderItem) {
        orderItemMapper.addOrderItem(orderItem);
    }
}
