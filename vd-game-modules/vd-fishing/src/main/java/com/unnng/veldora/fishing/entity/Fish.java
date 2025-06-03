package com.unnng.veldora.fishing.entity;

import com.unnng.veldora.enums.Rarity;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Fish {
    private Integer id;
    private String name;
    private Rarity rarity;//等级
    private double price;
    private String des;
}
