package com.marekczelij;

public class Toner {

    private int tonerMaxLevel = 100;
    private int tonerEmptyLevel = 0;
    private int tonerAmountOnCharacter = 1;
    private int tonerLevel;

    public int fillUpToner(int toner)
    {
        int tempLvl=(this.tonerLevel+toner);
        if(tempLvl<=100 && toner>0) {
            this.tonerLevel = tempLvl;
            return 0;
        }
        System.out.println("Too much toner or bad type of toner");
        return -1;
    }


    public void decreaseTonerLevel(int toner)
    {
        this.tonerLevel-=toner;
    }

    public Toner() {
        this.tonerLevel = tonerMaxLevel-10;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getTonerMaxLevel() {
        return tonerMaxLevel;
    }

    private void setTonerMaxLevel(int tonerMaxLevel) {
        this.tonerMaxLevel = tonerMaxLevel;
    }

    public int getTonerEmptyLevel() {
        return tonerEmptyLevel;
    }

    public void setTonerEmptyLevel(int tonerEmptyLevel) {
        this.tonerEmptyLevel = tonerEmptyLevel;
    }

    public int getTonerAmountOnCharacter() {
        return tonerAmountOnCharacter;
    }

    public void setTonerAmountOnCharacter(int tonerAmountOnCharacter) {
        this.tonerAmountOnCharacter = tonerAmountOnCharacter;
    }
}
