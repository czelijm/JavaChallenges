package com.company;

public class Detector {
    int maxThreshold = 20;
    int currentValue=0;

    public Detector(int maxThreshold) {
        this.maxThreshold = maxThreshold;
    }

    public void setCurrentValue(int currentValue) throws ThresholdExtendException {
        this.currentValue = currentValue;
        detectValue(currentValue);
    }

    public void detectValue(int value) throws ThresholdExtendException {
        if(value>this.maxThreshold){
            throw new ThresholdExtendException("Threshold exided");
        }
        System.out.println("Value OK!");
    }
}
