package com.shbak.kiosk.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @NotNull
    public Long id;

    @NotNull
    public int quantity;

    @NotNull
    public Long menuId;

    @NotNull
    @Setter
    public Long orderId;
}
