package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank pko = new Bank();

        pko.addBranch(new Branch());
        pko.addBranch(new Branch());

        pko.addCustomer(0,new Customer("Marek",100.00D));
        pko.addCustomer(0,new Customer("Jabami"));
        pko.addTransaction2CustomerInBrach(0,"Jabami",4000000000.00D);

        pko.addCustomer(1,new Customer("Igor",300000000.00D));
        pko.addTransaction2CustomerInBrach(1,"Igor",2000000000.00D);



        pko.printCustomerList();
        pko.printCustomerListWithTransctions();
    }
}
