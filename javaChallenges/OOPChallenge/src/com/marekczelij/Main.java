package com.marekczelij;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Addition salata = new Addition("Lettuce","0.25");
        Addition pomidor = new Addition("Tomato","2.25");
        Addition ser = new Addition("Cheese","3.00");
        Addition ogorek = new Addition("Cucumber","1.00");
        Addition cebula = new Addition("Onion","1.50");

        Burger kevin = new Burger("Kevin","20.00",new ArrayList<Addition>(Arrays.asList(ser,cebula)),"beef","medium","white");
        System.out.println("burger "+kevin.getName()+" price "+kevin.finalPrice());
        kevin.addAddition(new Chips("5.00"));
        kevin.addAddition(new Drinks("5.00"));
        kevin.addAddition(pomidor);
        System.out.println("burger "+kevin.getName()+" price "+kevin.finalPrice());

        HealtyBurger italianSheppard = new HealtyBurger("Italian Sheppard","30.00",new ArrayList<Addition>(Arrays.asList(ser,cebula,new Drinks("5.00"),new Chips("5.00"))),"beef","medium","white");
        italianSheppard.addAddition(pomidor);
        italianSheppard.addAddition(ser);
        italianSheppard.addAddition(salata);
        System.out.println("burger "+italianSheppard.getName()+" price "+italianSheppard.finalPrice());

        DeluxeBurger goliath = new DeluxeBurger("Goliath","50.00","beef","medium","white");
        goliath.addAddition(ser);
        System.out.println("burger "+goliath.getName()+" price "+goliath.finalPrice());

        Order order = new Order();
        order.setName("Marek");
        order.dishList.add(goliath);
        order.dishList.add(kevin);
        order.dishList.add(italianSheppard);
        System.out.println("order "+order.getName()+" price "+order.finalPrice());

    }


}
