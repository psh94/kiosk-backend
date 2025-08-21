package com.shbak.kiosk.controller;

import com.shbak.kiosk.model.Order;
import com.shbak.kiosk.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }

    @PutMapping
    public void updateOrder(@RequestBody Long id){
        orderService.updateOrderTotalPrice(id);
    }
}
