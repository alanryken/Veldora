package com.unnng.veldora.fishing.effect;

import com.unnng.veldora.common.inter.IEffectProvider;
import com.unnng.veldora.enums.Rarity;

import java.util.Map;

/**
 * 鱼饵
 * @author no one
 * @date 2025-06-03 11:35
 */
public class Bait implements IEffectProvider {
    private Integer id;
    private String name; // 鱼饵名称
    private Double price;
    private Map<Rarity, Double> probabilityModifiers; // 稀有度 -> 概率加成
    private int remainingUses; // 剩余使用次数

    public Bait(Integer id, String name, Double price, Map<Rarity, Double> probabilityModifiers) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.probabilityModifiers = probabilityModifiers;
        this.remainingUses = 0;
    }

    public Bait(String name, Map<Rarity, Double> probabilityModifiers, int maxUses) {
        this.name = name;
        this.probabilityModifiers = probabilityModifiers;
        this.remainingUses = maxUses;
    }

    @Override
    public Map<Rarity, Double> getProbabilityModifiers() {
        return probabilityModifiers;
    }

    @Override
    public boolean isActive() {
        return remainingUses > 0;
    }

    // 使用一次鱼饵
    public void use() {
        if (remainingUses > 0) {
            remainingUses--;
        }
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getRemainingUses() {
        return remainingUses;
    }
}
