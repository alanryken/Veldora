package com.unnng.veldora.common.inter;

public interface IEffectProvider {
    // 获取对某种物品加成效果
    Map<Rarity, Double> getProbabilityModifiers();

    // 检查效果是否可用（例如鱼饵剩余次数）
    boolean isActive();
}
