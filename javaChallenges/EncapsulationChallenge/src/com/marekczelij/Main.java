package com.marekczelij;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello World!");

        Printer hp = new Printer();
        System.out.println("Toner level in printer is "+hp.tonerLevelState());
        hp.printStrintOnPage("Hello, It's nice to meet you. I'm your new printer :):):):):):):):):):):)");
        System.out.println("Toner level in printer is "+hp.tonerLevelState());
        hp.printCharacterOnPage('X');
        System.out.println("Toner level in printer is "+hp.tonerLevelState());
        hp.printStrintOnPage("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        hp.fillUpTonerinPrinter(100);
        hp.fillUpTonerinPrinter(-100);
        hp.fillUpTonerinPrinter(70);
        System.out.println("Toner level in printer is "+hp.tonerLevelState());
        hp.printPages(3);
        System.out.println("Number of printed pages "+hp.getNumberOfPrintedPages());


    }
}
