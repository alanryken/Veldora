package com.unnng.veldora.fishing.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Fish {
    private Integer id;
    private String name;
    private String des;
    private BigDecimal price;
    private Integer level;//等级
}
