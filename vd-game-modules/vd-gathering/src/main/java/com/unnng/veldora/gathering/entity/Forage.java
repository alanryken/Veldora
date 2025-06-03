package com.unnng.veldora.gathering.entity;

import com.unnng.veldora.entity.Resource;
import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.enums.ResourceTypeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Forage extends Resource {

    public Forage(Integer id, String name, Rarity rarity, double price, String des) {
        super(id, name, rarity, price, des, ResourceTypeEnum.GATHERING);
    }
}
