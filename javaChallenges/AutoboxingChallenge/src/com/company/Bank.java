package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addBranch(Branch branch){
        branches.add(branch);
    }

    public void addCustomer(int index,Customer customer){
        branches.get(index).addCustomer(customer);
    }

    public void addTransaction2CustomerInBrach(int indexBranch,String name, double transaction){
        branches.get(indexBranch).getCustomerUsingName(name).addTransaction(transaction);
    }

    public void printCustomerList(){
        for (Branch branch : branches) {
            for(int i=0;i<branch.getNumberOfCustomers();i++){
                System.out.println(branch.getCustomerAtIndex(i).getName());
                //branch.getCustomerAtIndex(i).getName();
            }
        }
    }

    public void printCustomerListWithTransctions(){
        for (Branch branch : branches) {
            for(int i=0;i<branch.getNumberOfCustomers();i++){
                //System.out.println(branch.getCustomerAtIndex(i).getName());
                for (int j=0;j<branch.getCustomerAtIndex(i).getNumberOfTransactions();j++) {
                    //System.out.println(branch.getCustomerAtIndex(i).getName());
                    System.out.println(branch.getCustomerAtIndex(i).getName()+" " + branch.getCustomerAtIndex(i).getTransactionAtIndex(j));
                }
                //branch.getCustomerAtIndex(i).getName();
            }
        }
    }


}
