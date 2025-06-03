package com.unnng.veldora.fishing.effect;

import com.unnng.veldora.common.inter.IEffectProvider;
import com.unnng.veldora.enums.Rarity;

import java.util.Map;

public class Rod implements IEffectProvider {
    private String name;
    private Map<Rarity, Double> probabilityModifiers;

    public Rod(String name, Map<Rarity, Double> probabilityModifiers) {
        this.name = name;
        this.probabilityModifiers = probabilityModifiers;
    }

    @Override
    public Map<Rarity, Double> getProbabilityModifiers() {
        return probabilityModifiers;
    }

    @Override
    public boolean isActive() {
        return true; // 鱼竿始终生效
    }

    @Override
    public void use() {
        //耐久度 -1
    }
}
