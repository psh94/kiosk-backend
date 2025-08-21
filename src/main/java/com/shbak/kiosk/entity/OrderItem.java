package com.shbak.kiosk.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {

    @NotNull
    public Long id;

    @NotNull
    public int quantity;

    @NotNull
    public Long menuId;

    @NotNull
    public Long orderId;
}
