package com.marek;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    public Dog(String name, int size, int weight) {
        super(name, 1, 1, size, weight);
    }

    private void chew(){
        System.out.println("Chew chew!!");
    }

    public void walk() {
        System.out.println("Dog walked!!");
        super.move(50);
    }

    public void run(int speed) {
        System.out.println("Dog run!! With speed" + speed);
        move(10);
    }

    public void moveLegs(int speed) {System.out.println("Dog moved legs!! With speed" + speed);}

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog run!! With speed" + speed);
        moveLegs(speed);
        super.move(speed);
    }
}

