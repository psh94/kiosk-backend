package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.OrderItem;
import com.shbak.kiosk.repository.OrderItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemMapper orderItemMapper;

    @Override
    @Transactional
    public void addOrderItems(List<OrderItem> orderItems, Long orderId) {
        for (OrderItem orderItem: orderItems){
            orderItem.setOrderId(orderId);
            orderItemMapper.addOrderItem(orderItem);
        }
    }
}
