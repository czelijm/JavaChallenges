package com.marekczelij;

public interface IAnimalBehaviors extends IMove,ISpeak{
    @Override
    void move();

    @Override
    void speak();

    default void eat(){
        System.out.println("Omnomnomnom");
    }

}
