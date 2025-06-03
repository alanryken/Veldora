package com.unnng.veldora.enums;

/**
 * 稀有度
 * @author no one
 * @date 2025-06-03 11:23
 */
public enum Rarity {
    COMMON(1, 0.7, "White", "普通"),
    UNCOMMON(2, 0.5, "Green", "优秀"),
    RARE(3, 0.2, "Blue", "稀有"),
    EPIC(4, 0.05, "Purple", "史诗"),
    LEGENDARY(5, 0.01, "Orange", "传说"),
    MYTHIC(6, 0.001, "Rainbow", "神话");

    private final int level;
    private final double baseProbability;
    private final String description;
    private final String color;


    Rarity(int level, double baseProbability, String color, String description) {
        this.level = level;
        this.baseProbability = baseProbability;
        this.color = color;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public double getBaseProbability() {
        return baseProbability;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }
}

