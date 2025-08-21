package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.OrderItem;
import com.shbak.kiosk.repository.OrderItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemMapper orderItemMapper;

    @Override
    @Transactional
    public void addOrderItem(OrderItem orderItem) {
        orderItemMapper.addOrderItem(orderItem);
    }
}
