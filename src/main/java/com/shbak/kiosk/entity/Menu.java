package com.shbak.kiosk.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    @NotNull
    public Long id;

    @NotNull
    public String name;

    @NotNull
    public Long price;

    @NotNull
    public Long categoryId;

    public String description;
}
