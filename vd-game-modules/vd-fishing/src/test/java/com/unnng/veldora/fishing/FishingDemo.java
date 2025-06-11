package com.unnng.veldora.fishing;

import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.fishing.effect.Bait;
import com.unnng.veldora.fishing.effect.Weather;
import com.unnng.veldora.fishing.entity.Fish;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class FishingDemo {
    public static void main(String[] args) {
        // 定义天气（雨天：普通鱼+20%，传说鱼-20%）
        Map<Rarity, Double> weatherModifiers = new HashMap<>();
//        weatherModifiers.put(Rarity.COMMON, 0.2);
//        weatherModifiers.put(Rarity.LEGENDARY, -0.2);
        Weather rainy = new Weather("雨天", weatherModifiers);

        // 定义鱼饵（星辰鱼饵：传说鱼+100% 且不会命中低等鱼类）
        Map<Rarity, Double> baitModifiers = new HashMap<>();
        baitModifiers.put(Rarity.COMMON, - Rarity.COMMON.getBaseProbability());
        baitModifiers.put(Rarity.UNCOMMON, - Rarity.UNCOMMON.getBaseProbability());
        baitModifiers.put(Rarity.RARE, - Rarity.RARE.getBaseProbability());
        baitModifiers.put(Rarity.EPIC, - Rarity.EPIC.getBaseProbability());
        baitModifiers.put(Rarity.LEGENDARY, 1.0);
        Bait starshineBait = new Bait("星辰鱼饵", baitModifiers, 20000);

        // 创建钓鱼上下文
        FishingContext context = new FishingContext();
        context.addEffectProvider(rainy);
        context.addEffectProvider(starshineBait);

        // 执行钓鱼
        FishingManager manager = new FishingManager();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            Fish result = manager.castRod(context);
            // 输出结果
            if (result != null) {
//                System.out.println("捕获: " + result.getName() + " (" + result.getRarity().getDescription() + ")");
                Integer pt = map.get(result.getRarity().getDescription());
                if (pt == null) pt = 1;
                else pt++;
                map.put(result.getRarity().getDescription(), pt);
            } else {
                System.out.println("空钩！什么也没钓到。");
            }
        }
        // 计算总和
        int sum = map.values().stream().mapToInt(Integer::intValue).sum();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            double percentage = (value * 100.0 / sum);
            // 格式化为字符串，保留4位小数并添加%
            String formattedPercentage = String.format("%.2f%%", percentage);

            System.out.println(entry.getKey() + ":" + entry.getValue() + "  " + formattedPercentage);
        }
    }
}
