package com.shbak.kiosk.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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

    @NotNull
    public List<Menu> menu = new ArrayList<>();
}
