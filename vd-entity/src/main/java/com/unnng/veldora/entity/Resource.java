package com.unnng.veldora.entity;

import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.enums.ResourceTypeEnum;
import lombok.Data;

import java.util.Objects;

@Data
public class Resource {
    private Integer id;
    private String name;
    private Rarity rarity;//等级
    private double price;
    private String des;
    private ResourceTypeEnum type;

    public Resource() {
    }

    public Resource(ResourceTypeEnum type) {
        this.type = type;
    }

    public Resource(Integer id, String name, Rarity rarity, double price, String des, ResourceTypeEnum type) {
        this.id = id;
        this.name = name;
        this.rarity = rarity;
        this.price = price;
        this.des = des;
        this.type = type;
    }
}
