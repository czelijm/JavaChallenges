package com.marekczelij;

public class Main {

    public static void main(String[] args) {
        MobilePhone xiaomi = new MobilePhone();

        xiaomi.getPhoneMenu().printMenuOptions();

        xiaomi.addContact(new Contact("Marek","777777777"));
        xiaomi.addContact(new Contact("Bruno","888777555"));

        xiaomi.printContactList();
        System.out.println(xiaomi.findContact("Marek").getNumber());


        System.out.println(xiaomi.findIndexOfItemByName("Bruno"));

        xiaomi.removeContactByName("Bruno");
        xiaomi.printContactList();
        xiaomi.updateExistingContact(0,new Contact("Marek","888888888"));
        xiaomi.updateExistingContact(1,new Contact("Arek","888888888"));
        xiaomi.printContactList();
        System.out.println(xiaomi.findContact("Marek").getNumber());

    }
}
