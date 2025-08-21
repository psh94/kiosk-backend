package com.shbak.kiosk.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    @NotNull
    public Long id;

    public int totalPrice;
}
