package com.marekczelij;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String Name="Unknown";
    List<Dish> dishList = new ArrayList<Dish>();

    public String finalPrice(){
        double tempPrice=0.0D;
        for (Dish dish:dishList) {
            tempPrice += Double.parseDouble(dish.getPrice())+Double.parseDouble(dish.additionsPrice());
        }

        return Double.toString(tempPrice);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }
}
