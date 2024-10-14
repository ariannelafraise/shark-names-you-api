package dev.paintilya.sharknamesyouapi.model;

import java.util.Dictionary;

public class Name {
    private final String name;
    private final Dictionary<String, Integer> yearlyUsage;
    private final int totalUsage;

    public Name(String name, Dictionary<String, Integer> yearlyUsage, int totalUsage) {
        this.name = name;
        this.yearlyUsage = yearlyUsage;
        this.totalUsage = totalUsage;
    }

    public String getName() {
        return this.name;
    }

    public Dictionary<String, Integer> getYearlyUsage() {
        return this.yearlyUsage;
    }

    public int getTotalUsage() {
        return this.totalUsage;
    }
}
