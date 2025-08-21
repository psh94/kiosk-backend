package com.shbak.kiosk.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @NotNull
    public Long id;

    @NotNull
    public String name;
}
