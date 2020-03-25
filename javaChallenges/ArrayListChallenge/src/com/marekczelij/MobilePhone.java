package com.marekczelij;

import java.util.*;

public class MobilePhone {
    private boolean isOn = true;
    ArrayList<Contact> contactList = new ArrayList<Contact>();
    private Menu phoneMenu = new Menu();

    public void quit() {
        isOn = false;
    }

    public void printContactList()
    {
        for (Contact contact : contactList)
            System.out.println(contact.getName());
    }

    public boolean addContact(Contact contact){
        //if (findItemByName(contact.getName())!=null){
        if (findIndexOfItemByName(contact.getName())>-1){
            System.out.println("Contact with this name exist!!!");
            return false;
        }
        this.contactList.add(contact);
        return true;
    }


    public void updateExistingContact(int index, Contact contact){
        if(index>-1 && index<contactList.size()){
            this.contactList.set(index,contact);
        }
    }

    public void removeContactByIndex(int index){
        if(index>-1 && index<contactList.size()) {
            this.contactList.remove(index);
        }
    }

    public void removeContactByName(String name){
        int index = findIndexOfItemByName(name);
        if (index >-1)
            this.contactList.remove(index);
    }

    private Contact findItemByName(String name)
    {
//        List<String> list = Arrays.asList("zero", "one", "two");
//        ListIterator iter = list.listIterator();
//        while (iter.hasNext()) {
//            System.out.println("index: " + iter.nextIndex() + " value: " + iter.next());
//        }

        Iterator<Contact> iterator = contactList.iterator();
        while(iterator.hasNext()){
            Contact contact = iterator.next();
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    public int findIndexOfItemByName(String name)
    {
        int i = 0;
        for (Iterator<Contact> iterator = contactList.iterator();iterator.hasNext();i++){
            Contact contact = iterator.next();
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact findContact(String contactName){
        return findItemByName(contactName);
    }

    public Menu getPhoneMenu() {
        return phoneMenu;
    }
}
