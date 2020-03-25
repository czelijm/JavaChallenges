package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> trastactions = new ArrayList<Double>();

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, double initialTransacion) {
        this.name = name;
        addTransaction(initialTransacion);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getNumberOfTransactions(){
        return trastactions.size();
    }

    public void addTransaction(double transaction){
        if(transaction>=0)
            this.trastactions.add(Double.valueOf(transaction));
    }

    public double getTransactionAtIndex(int index){
        return this.trastactions.get(index);
    }


}
