package com.shbak.kiosk.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
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
