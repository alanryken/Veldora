package com.unnng.veldora.fishing.data.local;


import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.fishing.effect.Bait;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BaitResources {
    public static Map<Integer, Bait> baitMap = new LinkedHashMap<>();

    private static void add(Bait bait) {
        baitMap.put(bait.getId(), bait);
    }

    static {

        // 1. 蚯蚓：普通鱼+50%
        Map<Rarity, Double> earthwormModifiers = new HashMap<>();
        earthwormModifiers.put(Rarity.COMMON, 0.5);
        add(new Bait(1, "蚯蚓", 5.0, earthwormModifiers));
        // 19. 米粒：普通鱼+45%
        Map<Rarity, Double> riceGrainModifiers = new HashMap<>();
        riceGrainModifiers.put(Rarity.COMMON, 0.45);
        add(new Bait(3, "米粒", 5.0, riceGrainModifiers));

        // 13. 蚂蚁：普通鱼+55%，稀有鱼-15%
        Map<Rarity, Double> antModifiers = new HashMap<>();
        antModifiers.put(Rarity.COMMON, 0.55);
        add(new Bait(15, "蚂蚁", 6.0, antModifiers));

        // 7. 红虫：普通鱼+60%，稀有鱼-10%
        Map<Rarity, Double> redWormModifiers = new HashMap<>();
        redWormModifiers.put(Rarity.COMMON, 0.6);
        add(new Bait(9, "红虫", 6.0, redWormModifiers));

        // 2. 面包屑：稀有鱼+70%，普通鱼-30%
        Map<Rarity, Double> breadcrumbModifiers = new HashMap<>();
        breadcrumbModifiers.put(Rarity.COMMON, -0.3);
        breadcrumbModifiers.put(Rarity.UNCOMMON, 0.7);
        add(new Bait(2, "面包屑", 30.0, breadcrumbModifiers));
        // 20. 蚕豆：稀有鱼+60%，普通鱼-15%
        Map<Rarity, Double> broadBeanModifiers = new HashMap<>();
        broadBeanModifiers.put(Rarity.COMMON, -0.15);
        broadBeanModifiers.put(Rarity.UNCOMMON, 0.6);
        add(new Bait(4, "蚕豆", 30.0, broadBeanModifiers));

        // 15. 蛤蜊肉：优秀鱼+75%，低等鱼-35%
        Map<Rarity, Double> clamMeatModifiers = new HashMap<>();
        clamMeatModifiers.put(Rarity.COMMON, -0.35);
        clamMeatModifiers.put(Rarity.RARE, -0.35);
        clamMeatModifiers.put(Rarity.UNCOMMON, 0.75);
        add(new Bait(17, "蛤蜊肉", 35.0, clamMeatModifiers));

        // 9. 蟹肉：优秀鱼+85%，低等鱼-30%
        Map<Rarity, Double> crabMeatModifiers = new HashMap<>();
        crabMeatModifiers.put(Rarity.COMMON, -0.3);
        crabMeatModifiers.put(Rarity.RARE, -0.3);
        crabMeatModifiers.put(Rarity.UNCOMMON, 0.85);
        add(new Bait(11, "蟹肉", 38.0, crabMeatModifiers));

        // 3. 虾肉：优秀鱼+80%，低等鱼-40%
        Map<Rarity, Double> shrimpMeatModifiers = new HashMap<>();
        shrimpMeatModifiers.put(Rarity.COMMON, -0.4);
        shrimpMeatModifiers.put(Rarity.RARE, -0.4);
        shrimpMeatModifiers.put(Rarity.UNCOMMON, 0.8);
        add(new Bait(5, "虾肉", 40.0, shrimpMeatModifiers));


        // 8. 鱼卵：稀有鱼+75%，普通鱼-25%
        Map<Rarity, Double> fishEggModifiers = new HashMap<>();
        fishEggModifiers.put(Rarity.RARE, 0.75);
        add(new Bait(10, "鱼卵", 120.0, fishEggModifiers));

        // 16.  octopusTentacle：史诗鱼+85%，低等鱼不影响
        Map<Rarity, Double> octopusTentacleModifiers = new HashMap<>();
        octopusTentacleModifiers.put(Rarity.EPIC, 0.85);
        add(new Bait(18, "章鱼触手", 750.0, octopusTentacleModifiers));

        // 4. 小鱼干：史诗鱼+90%，低等鱼不影响
        Map<Rarity, Double> driedFishModifiers = new HashMap<>();
        driedFishModifiers.put(Rarity.EPIC, 0.9);
        add(new Bait(6, "飛鱼干", 800.0, driedFishModifiers));

        // 10. 鱿鱼块：史诗鱼+95%，低等鱼不影响
        Map<Rarity, Double> squidPieceModifiers = new HashMap<>();
        squidPieceModifiers.put(Rarity.EPIC, 0.95);
        add(new Bait(12, "鱿鱼块", 820.0, squidPieceModifiers));

        // 11. 鲑鱼片：传说鱼+110%，低等鱼-60%
        Map<Rarity, Double> salmonSliceModifiers = new HashMap<>();
        salmonSliceModifiers.put(Rarity.COMMON, -0.6);
        salmonSliceModifiers.put(Rarity.RARE, -0.6);
        salmonSliceModifiers.put(Rarity.UNCOMMON, -0.6);
        salmonSliceModifiers.put(Rarity.EPIC, -0.6);
        salmonSliceModifiers.put(Rarity.LEGENDARY, 1.1);
        add(new Bait(13, "鲑鱼片", 1200.0, salmonSliceModifiers));

        // 5. 金枪鱼饵：传说鱼+100%，低等鱼不捕获
        Map<Rarity, Double> tunaBaitModifiers = new HashMap<>();
        tunaBaitModifiers.put(Rarity.COMMON, -Rarity.COMMON.getBaseProbability());
        tunaBaitModifiers.put(Rarity.UNCOMMON, -Rarity.UNCOMMON.getBaseProbability());
        tunaBaitModifiers.put(Rarity.RARE, -Rarity.RARE.getBaseProbability());
        tunaBaitModifiers.put(Rarity.EPIC, -Rarity.EPIC.getBaseProbability());
        tunaBaitModifiers.put(Rarity.LEGENDARY, 1.0);
        add(new Bait(7, "金枪鱼饵", 1500.0, tunaBaitModifiers));

        // 17. 鲨鱼肝：传说鱼+105%，低等鱼-55%
        Map<Rarity, Double> sharkLiverModifiers = new HashMap<>();
        tunaBaitModifiers.put(Rarity.COMMON, -Rarity.COMMON.getBaseProbability());
        tunaBaitModifiers.put(Rarity.UNCOMMON, -Rarity.UNCOMMON.getBaseProbability());
        tunaBaitModifiers.put(Rarity.RARE, -Rarity.RARE.getBaseProbability());
        tunaBaitModifiers.put(Rarity.EPIC, -Rarity.EPIC.getBaseProbability());
        sharkLiverModifiers.put(Rarity.LEGENDARY, 1.5);
        add(new Bait(19, "鲨鱼肝",1600.0, sharkLiverModifiers));


        // 12. 星辰粉末：隐藏鱼+130%，其他-70%
        Map<Rarity, Double> starDustModifiers = new HashMap<>();

        starDustModifiers.put(Rarity.COMMON, -Rarity.COMMON.getBaseProbability());
        starDustModifiers.put(Rarity.UNCOMMON, -Rarity.UNCOMMON.getBaseProbability());
        starDustModifiers.put(Rarity.RARE, -Rarity.RARE.getBaseProbability());
        starDustModifiers.put(Rarity.EPIC, -Rarity.EPIC.getBaseProbability());
        starDustModifiers.put(Rarity.LEGENDARY, -0.7);
        starDustModifiers.put(Rarity.MYTHIC, 1.3);
        add(new Bait(14, "星辰粉末", 3000.0, starDustModifiers));



        // 18. 虚空诱饵：隐藏鱼+115%，其他-60%
//        Map<Rarity, Double> voidLureModifiers = new HashMap<>();
//
//        voidLureModifiers.put(Rarity.COMMON, -Rarity.COMMON.getBaseProbability());
//        voidLureModifiers.put(Rarity.UNCOMMON, -Rarity.UNCOMMON.getBaseProbability());
//        voidLureModifiers.put(Rarity.RARE, -Rarity.RARE.getBaseProbability());
//        voidLureModifiers.put(Rarity.EPIC, -Rarity.EPIC.getBaseProbability());
//        sharkLiverModifiers.put(Rarity.LEGENDARY, 0.85);
//        voidLureModifiers.put(Rarity.MYTHIC, 1.0);
//        add(new Bait(20, "虚空诱饵",4000.0, voidLureModifiers));

    }
}
