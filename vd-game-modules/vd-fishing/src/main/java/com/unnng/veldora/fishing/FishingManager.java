package com.unnng.veldora.fishing;

import com.unnng.veldora.common.inter.IEffectProvider;
import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.fishing.entity.Fish;

import java.util.*;

public class FishingManager {
    private List<Fish> availableFish; // 可捕获的鱼列表
    private Random random; // 随机数生成器

    public FishingManager() {
        this.availableFish = new ArrayList<>();
        this.random = new Random();
        initializeFish();
    }

    // 初始化鱼类（示例数据）
    private void initializeFish() {
        availableFish.add(new Fish(1, "鲤鱼", Rarity.COMMON, 30, "常见淡水鱼"));
        availableFish.add(new Fish(2, "彩虹鳟鱼", Rarity.RARE, 250, "鳞片七彩"));
        availableFish.add(new Fish(3, "碧玉鲨", Rarity.EPIC, 1000, "翡翠鳞片"));
        availableFish.add(new Fish(4, "幻影金枪鱼", Rarity.LEGENDARY, 2500, "透明身体"));
    }

    // 执行一次钓鱼
    public Fish castRod(FishingContext context) {
        // 计算每种鱼的最终捕获概率
        Map<Fish, Double> probabilities = calculateProbabilities(context);
        double totalProbability = probabilities.values().stream().mapToDouble(Double::doubleValue).sum();

        // 随机决定结果
        double roll = random.nextDouble() * totalProbability;
        double cumulative = 0;
        for (Map.Entry<Fish, Double> entry : probabilities.entrySet()) {
            cumulative += entry.getValue();
            if (roll <= cumulative) {
                for (IEffectProvider effect : context.getActiveEffects()) {
                    effect.use();
                }
                return entry.getKey(); // 返回捕获的鱼
            }
        }
        return null; // 空钩（未捕获）
    }

    // 计算每种鱼的捕获概率
    private Map<Fish, Double> calculateProbabilities(FishingContext context) {
        Map<Fish, Double> probabilities = new HashMap<>();
        List<IEffectProvider> effects = context.getActiveEffects();

        for (Fish fish : availableFish) {
            double probability = fish.getRarity().getBaseProbability();
            // 应用所有效果的加成
            for (IEffectProvider effect : effects) {
                Double modifier = effect.getProbabilityModifiers().getOrDefault(fish.getRarity(), 0.0);
                probability *= (1 + modifier); // 乘法加成（例如+20% = *1.2）
            }
            // 确保概率非负且不超过合理范围
            probability = Math.max(0, Math.min(probability, 1.0));
            probabilities.put(fish, probability);
        }

        return probabilities;
    }
}
