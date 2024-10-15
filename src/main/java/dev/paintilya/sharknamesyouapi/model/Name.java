package dev.paintilya.sharknamesyouapi.model;

import com.opencsv.bean.CsvBindByName;

public class Name {
    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Total")
    private int totalUsage;

    public String getName() {
        return this.name;
    }

    public int getTotalUsage() {
        return this.totalUsage;
    }
}
