package com.marekczelij;

public class Addition {
    private String name;
    private String price;
    //List<Addition> additionList;// = new ArrayList<Addition>();

    public Addition(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public Addition() {
        this("Unknown","Unknown");
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

class Chips extends Addition{
    public Chips(String price) {
        super("Chips", price);
    }

    public Chips() {

    }
}

class Drinks extends Addition{
    public Drinks (String price) {
        super("Drinks", price);
    }

    public Drinks() {

    }
}


