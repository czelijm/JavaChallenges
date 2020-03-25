package com.marekczelij;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dish {
    private String name;
    private String price;
    List<Addition> additionList;// = new ArrayList<Addition>();

    public Dish(String name, String price, List<Addition> additionList) {
        this.name = name;
        this.price = price;
        this.additionList = additionList;
    }

    public Dish(){
        this("Unknown","Unknown",new ArrayList<Addition>());
    }

    public String additionsPrice(){
        double tempPrice=0.0D;
        for (Addition addition:additionList) {
            tempPrice += Double.parseDouble(addition.getPrice());
        }
        return Double.toString(tempPrice);
    }

    public String finalPrice(){
        return Double.toString(Double.parseDouble(additionsPrice())+Double.parseDouble(getPrice()));
    }

    public void addAddition(Addition addition){
        if(additionList.size()>=4) {
            System.out.println("Too much additions added!");
            return;
        }
        this.additionList.add(addition);
        return;
    }

    public void removeAddition(Addition addition){
        if(additionList.size()<1) {
            System.out.println("Can't remove addition!");
            return;
        }
        this.additionList.remove(addition);
        return;
    }

    public void removeAddition(int index){
        if(additionList.size()<1) {
            System.out.println("Can't remove addition!");
            return;
        }
        this.additionList.remove(index);
        return;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

class Burger extends Dish{
    private String meatType;
    private String levelOfMeatRoasting;
    private String breadRollType;
    //private int maxNumberOfAdditions = 4;

    public Burger(String name, String price, List<Addition> additionList, String meatType, String levelOfMeatRoasting, String breadRollType) {
        super(name, price, additionList);
        this.meatType = meatType;
        this.levelOfMeatRoasting = levelOfMeatRoasting;
        this.breadRollType = breadRollType;
    }

    public Burger(String price, String meatType, String levelOfMeatRoasting, String breadRollType) {
        super("Burger", price, new ArrayList<Addition>());
        this.meatType = meatType;
        this.levelOfMeatRoasting = levelOfMeatRoasting;
        this.breadRollType = breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public String getLevelOfMeatRoasting() {
        return levelOfMeatRoasting;
    }

    public void setLevelOfMeatRoasting(String levelOfMeatRoasting) {
        this.levelOfMeatRoasting = levelOfMeatRoasting;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }
}


class HealtyBurger extends Burger{

//private int maxNumberOfAdditions =6;

    public HealtyBurger(String name, String price, List<Addition> additionList, String meatType, String levelOfMeatRoasting, String breadRollType) {
        super(name, price, additionList, meatType, levelOfMeatRoasting, breadRollType);
    }

    public HealtyBurger(String price, String meatType, String levelOfMeatRoasting, String breadRollType) {
        super(price, meatType, levelOfMeatRoasting, breadRollType);
    }

    @Override
    public void addAddition(Addition addition) {
        if(additionList.size()>=6) {
            System.out.println("Too much additions added!");
            return;
        }
        this.additionList.add(addition);
        return;
    }
}

class DeluxeBurger extends Burger{
    public DeluxeBurger(String name, String price, String meatType, String levelOfMeatRoasting, String breadRollType) {
        super(name, price,  new ArrayList<>(Arrays.asList(new Chips("5.00"),new Drinks("5.00"))), meatType, levelOfMeatRoasting, breadRollType);
    }

    @Override
    public void addAddition(Addition addition) {
            System.out.println("Too much additions added!");
            return;
    }
}