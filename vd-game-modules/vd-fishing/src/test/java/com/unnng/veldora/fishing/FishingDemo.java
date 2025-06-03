package com.unnng.veldora.fishing;

import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.fishing.effect.Bait;
import com.unnng.veldora.fishing.effect.Weather;
import com.unnng.veldora.fishing.entity.Fish;

import java.util.HashMap;
import java.util.Map;

public class FishingDemo {
    public static void main(String[] args) {
        // 定义天气（雨天：普通鱼+20%，传说鱼-20%）
        Map<Rarity, Double> weatherModifiers = new HashMap<>();
        weatherModifiers.put(Rarity.COMMON, 0.2);
        weatherModifiers.put(Rarity.LEGENDARY, -0.2);
        Weather rainy = new Weather("雨天", weatherModifiers);

        // 定义鱼饵（星辰鱼饵：传说鱼+100%）
        Map<Rarity, Double> baitModifiers = new HashMap<>();
        baitModifiers.put(Rarity.LEGENDARY, 1.0);
        Bait starshineBait = new Bait("星辰鱼饵", baitModifiers, 10);

        // 创建钓鱼上下文
        FishingContext context = new FishingContext();
        context.addEffectProvider(rainy);
        context.addEffectProvider(starshineBait);

        // 执行钓鱼
        FishingManager manager = new FishingManager();
        Fish result = manager.castRod(context);

        // 输出结果
        if (result != null) {
            System.out.println("捕获: " + result.getName() + " (" + result.getRarity().getDescription() + ")");
        } else {
            System.out.println("空钩！什么也没钓到。");
        }
    }
}
