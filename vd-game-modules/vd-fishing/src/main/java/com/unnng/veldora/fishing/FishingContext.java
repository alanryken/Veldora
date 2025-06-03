package com.unnng.veldora.fishing;

import com.unnng.veldora.common.inter.IEffectProvider;
import com.unnng.veldora.fishing.effect.Bait;
import com.unnng.veldora.fishing.effect.Weather;

import java.util.ArrayList;
import java.util.List;

public class FishingContext {
    private List<IEffectProvider> additionalEffects; // 其他影响因素（扩展用）

    public FishingContext() {
        this.additionalEffects = new ArrayList<>();
    }

    // 添加其他影响因素（例如鱼竿、时间）
    public void addEffectProvider(IEffectProvider effect) {
        additionalEffects.add(effect);
    }

    // 获取所有活跃的效果
    public List<IEffectProvider> getActiveEffects() {
        List<IEffectProvider> effects = new ArrayList<>();
        for (IEffectProvider effect : additionalEffects) {
            if (effect.isActive()) effects.add(effect);
        }
        return effects;
    }
}
