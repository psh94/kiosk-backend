package com.shbak.kiosk.service;

import com.shbak.kiosk.entity.Order;
import com.shbak.kiosk.repository.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderMapper orderMapper;

    @Override
    @Transactional
    public void addOrder(Order order) {
        orderMapper.addOrder(order);
    }

    @Override
    @Transactional
    public Long getTotalPriceByJoin(Long id) {
        return orderMapper.getTotalPriceByJoin(id);
    }

    @Override
    @Transactional
    public void updateOrderTotalPrice(Long id){
        Long totalPrice = getTotalPriceByJoin(id);
        if (totalPrice>0) throw new IllegalArgumentException("totalPrice가 0보다 작습니다.");
        orderMapper.updateOrderTotalPrice(id, totalPrice);
    }
}
