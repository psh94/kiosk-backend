package com.shbak.kiosk.controller;

import com.shbak.kiosk.model.OrderItem;
import com.shbak.kiosk.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orderItems")
public class OrderItemController {

    private final OrderItemService orderItemService;

    @PostMapping
    public void addOrderItem(@RequestBody OrderItem orderItem){
        orderItemService.addOrderItem(orderItem);
    }
}
