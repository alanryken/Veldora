package com.unnng.veldora.fishing;

import com.unnng.veldora.common.inter.IEffectProvider;
import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.fishing.data.local.FishResources;
import com.unnng.veldora.fishing.entity.Fish;

import java.util.*;

public class FishingManager {
    private Map<Integer, Fish> availableFish; // 可捕获的鱼列表
    private Random random; // 随机数生成器

    public FishingManager() {
        this.availableFish = new LinkedHashMap<>();
        this.random = new Random();
        initializeFish();
    }

    // 初始化鱼类（示例数据）
    private void initializeFish() {
        availableFish = FishResources.fishMap;
    }

    // 执行一次钓鱼
    public Fish castRod(FishingContext context) {
        // 计算每种鱼的最终捕获概率
        Map<Integer, Double> probabilities = calculateProbabilities(context);
        double totalProbability = probabilities.values().stream().mapToDouble(Double::doubleValue).sum();

        // 随机决定结果
        double roll = random.nextDouble() * totalProbability;
        double cumulative = 0;
        for (Map.Entry<Integer, Double> entry : probabilities.entrySet()) {
            cumulative += entry.getValue();
            if (roll <= cumulative) {
                for (IEffectProvider effect : context.getActiveEffects()) {
                    effect.use();
                }
                return FishResources.fishMap.get(entry.getKey()); // 返回捕获的鱼
            }
        }
        return null; // 空钩（未捕获）
    }

    // 计算每种鱼的捕获概率
    private Map<Integer, Double> calculateProbabilities(FishingContext context) {
        Map<Integer, Double> probabilities = new HashMap<>();
        List<IEffectProvider> effects = context.getActiveEffects();

        for (Fish fish : availableFish.values()) {
            double probability = fish.getRarity().getBaseProbability();
            // 应用所有效果的加成
            for (IEffectProvider effect : effects) {
                Double modifier = effect.getProbabilityModifiers().getOrDefault(fish.getRarity(), 0.0);
                probability *= (1 + modifier); // 乘法加成（例如+20% = *1.2）
            }
            // 确保概率非负且不超过合理范围
            probability = Math.max(0, Math.min(probability, 1.0));
            probabilities.put(fish.getId(), probability);
        }

        return probabilities;
    }
}
