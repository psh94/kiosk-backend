package com.shbak.kiosk.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Category {

    @NotNull
    public Long id;

    @NotNull
    public String name;
}
