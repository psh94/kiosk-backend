package com.shbak.kiosk.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @NotNull
    public Long id;

    @NotNull
    public LocalDateTime date;

    @NotNull
    public Long userId;
}
