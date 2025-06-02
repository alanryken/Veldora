package com.unnng.veldora.enums;


public enum Rarity {
    COMMON(0.7, "普通"),
    RARE(0.2, "稀有"),
    EPIC(0.05, "史诗"),
    LEGENDARY(0.01, "传说");

    private final double baseProbability;
    private final String description;

    Rarity(double baseProbability, String description) {
        this.baseProbability = baseProbability;
        this.description = description;
    }

    public double getBaseProbability() {
        return baseProbability;
    }

    public String getDescription() {
        return description;
    }
}
