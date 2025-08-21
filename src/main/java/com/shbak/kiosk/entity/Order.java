package com.shbak.kiosk.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @NotNull
    public Long id;

    @NotNull
    public int totalPrice;
}
