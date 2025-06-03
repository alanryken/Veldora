package com.unnng.veldora.mining.entity;

import com.unnng.veldora.entity.Resource;
import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.enums.ResourceTypeEnum;

public class Mine extends Resource {

    public Mine(Integer id, String name, Rarity rarity, double price, String des) {
        super(id, name, rarity, price, des, ResourceTypeEnum.MINING);
    }
}
