package com.marekczelij;

public class Animal implements IAnimalBehaviors {


    @Override
    public void move() {
        System.out.println("I had moved");
    }

    @Override
    public void speak() {
        System.out.println("I Speak");
    }



}
