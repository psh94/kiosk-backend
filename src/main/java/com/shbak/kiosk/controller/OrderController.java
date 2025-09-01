package com.shbak.kiosk.controller;

import com.shbak.kiosk.entity.Order;
import com.shbak.kiosk.entity.OrderItem;
import com.shbak.kiosk.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public void addOrder(@RequestBody List<OrderItem> orderItems){
        orderService.addOrder(orderItems);
    }
}
