package com.shbak.kiosk.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @NotNull
    public Long id;

    @NotNull
    public LocalDateTime date;

    @NotNull
    public Long userId;

    @NotNull
    public List<OrderItem> orderItems = new ArrayList<>();

}
