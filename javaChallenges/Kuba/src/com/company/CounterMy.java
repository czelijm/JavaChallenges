package com.company;

public class CounterMy {
    private int maxThreshold; //max dopuszczalna wartosc licznika
    private int currentValue=0;

    public CounterMy(int maxThreshold){
        this.maxThreshold = maxThreshold;
    }

    public void setCurrentValue(int currentValue) throws CounterOveflowException {
        this.currentValue = currentValue;
        checkValue(this.currentValue);
    }


    public void checkValue(int value) throws CounterOveflowException {
        if(value>this.maxThreshold) {
            throw new CounterOveflowException("Current value overflow");
        }
        System.out.println("The value is OK!");
    }
}
