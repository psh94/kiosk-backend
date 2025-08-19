package com.shbak.kiosk.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.awt.*;

@Data
public class Menu {

    @NotNull
    public Long id;

    @NotNull
    public String name;

    @NotNull
    public Long price;

    public TextArea description;
}
