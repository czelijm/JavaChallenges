package com.marek;

public class Main {

    public static void main(String args[])
    {
        Animal animal = new Animal("Animal",1,1,32,32);
        Dog scruffy = new Dog("scruffy",44,34,2,4,1,33,"long silky");

        scruffy.eat();

        scruffy.run(550);
        scruffy.walk();


    }

}
