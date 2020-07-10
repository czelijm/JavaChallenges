package com.marekczelij;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Square s1 = new Square(10);
        Square s2 = new Square(20);

        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s1));
        System.out.println(s2.compareTo(s1));

        ArrayList<Square> s = new ArrayList();
        s.add(s1);
        s.add(s2);

        Animal dog = new Animal();
        dog.move();
        dog.speak();
        dog.eat();

    }
}
