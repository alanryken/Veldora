package com.unnng.veldora.fishing.effect;

import com.unnng.veldora.common.inter.IEffectProvider;
import com.unnng.veldora.enums.Rarity;

import java.util.Map;

/**
 * 天气
 * @author no one
 * @date 2025-06-03 11:35 
 */
public class Weather implements IEffectProvider {
    private String name; // 天气名称（例如“雨天”）
    private Map<Rarity, Double> probabilityModifiers; // 稀有度 -> 概率加成（可为负）

    public Weather(String name, Map<Rarity, Double> probabilityModifiers) {
        this.name = name;
        this.probabilityModifiers = probabilityModifiers;
    }

    @Override
    public Map<Rarity, Double> getProbabilityModifiers() {
        return probabilityModifiers;
    }

    @Override
    public boolean isActive() {
        return true; // 天气始终生效
    }

    @Override
    public void use() {

    }

    public String getName() {
        return name;
    }
}
