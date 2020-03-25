package com.marekczelij;

public class Song {
    private String name;
    private double durationTime;

    public Song(String name, double durationTime) {
        this.name = name;
        this.durationTime = durationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(double durationTime) {
        this.durationTime = durationTime;
    }

}
