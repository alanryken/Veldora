package com.unnng.veldora.fishing;

import com.unnng.veldora.common.inter.IEffectProvider;
import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.fishing.data.local.FishResources;
import com.unnng.veldora.fishing.entity.Fish;

import java.util.*;

public class FishingManager {
    private Map<Integer, Fish> availableFish; // 可捕获的鱼列表
    //    private Map<String, Double> rarityDoubleMap;//重新计算每种等级的概率
    private Random random; // 随机数生成器

    public FishingManager() {
        this.availableFish = FishResources.fishMap;
        this.random = new Random();
        initializeFish();
    }

    // 初始化鱼类（示例数据）
    private void initializeFish() {
    }

    // 执行一次钓鱼
    public Fish castRod(FishingContext context) {
        // 计算每种鱼的最终捕获概率
        Map<String, Double> probabilities = calculateProbabilities(context);
        double totalProbability = 0;//所有鱼的概率和
        for (Fish value : availableFish.values()) {
            totalProbability += probabilities.getOrDefault(value.getRarity().name(), 0.0);
        }
        // 随机决定结果
        double roll = random.nextDouble() * totalProbability;
        double cumulative = 0;

        for (Map.Entry<Integer, Fish> fishEntry : availableFish.entrySet()) {
            //获取当前鱼的概率
            Fish fish = fishEntry.getValue();
            String name = fish.getRarity().name();
            Double aDouble = probabilities.getOrDefault(name, 0.0);
            cumulative += aDouble;
            if (roll <= cumulative) {
                for (IEffectProvider effect : context.getActiveEffects()) {
                    effect.use();
                }
                return fishEntry.getValue(); // 返回捕获的鱼
            }
        }
        return null; // 空钩（未捕获）
    }

    // 计算每种等级的捕获概率
    private Map<String, Double> calculateProbabilities(FishingContext context) {
        Map<String, Double> probabilities = new HashMap<>();
        List<IEffectProvider> effects = context.getActiveEffects();
        for (Rarity value : Rarity.values()) {
            double probability = value.getBaseProbability();
            // 应用所有效果的加成
            for (IEffectProvider effect : effects) {
                Double modifier = effect.getProbabilityModifiers().getOrDefault(value, 0.0);
                probability += (modifier); //控制比例
            }
            // 确保概率非负且不超过合理范围
            probability = Math.max(0, Math.min(probability, 1.0));
            probabilities.put(value.name(), probability);
        }
        return probabilities;
    }
}
