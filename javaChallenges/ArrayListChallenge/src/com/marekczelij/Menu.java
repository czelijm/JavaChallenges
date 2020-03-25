package com.marekczelij;

public class Menu {
    public int printMenuOptions =   0;
    public int printContactList =   1;
    public int addContact =         2;
    public int modifyContact =      3;
    public int removeContact =      4;
    public int findContact =        5;


   //easy, time conuming way :D
   public void printMenuOptions()
   {
       System.out.println("printMenuOptions "+printMenuOptions);
       System.out.println("printContactList "+printContactList);
       System.out.println("addContact "+addContact);
       System.out.println("modifyContact "+modifyContact);
       System.out.println("removeContact "+removeContact);
       System.out.println("findContact "+findContact);
   }

}
