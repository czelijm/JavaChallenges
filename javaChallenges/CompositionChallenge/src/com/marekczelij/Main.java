package com.marekczelij;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Room beedroom = new Room();
        //Dimension dim = new Dimension(20,30,35);

        beedroom.setDimension(new Dimension(20,30,35));
        beedroom.getDoorList().add(new Door(new Dimension(10,20,5),"black",false));
        beedroom.getDoorList().add(new Door());

        beedroom.getWindowList().add(new Window(new Dimension(10,10,10),false));
        beedroom.getWindowList().add(new Window(new Dimension(10,10,10),false));
        beedroom.getWindowList().add(new Window(new Dimension(10,20,10),false));

        System.out.println("Number of doors in room " + beedroom.numberOfDoors());
        System.out.println("Number of windows in room " + beedroom.numberOfWindows());
        System.out.println("Area of room " + beedroom.areaOfRoom());
        System.out.println("Is air conditioner in room? : " + beedroom.isAirConditioner());

    }
}
