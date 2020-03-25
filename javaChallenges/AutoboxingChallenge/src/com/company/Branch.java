package com.company;

import java.util.ArrayList;

public class Branch {
    //private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public int getNumberOfCustomers(){
        return customers.size();
    }

    public int addCustomer(Customer customer){
        customers.add(customer);
        return 0;
    }

    public int addCustomerWithInnitialTransaciotn(Customer customer,double transaction){
        customers.add(customer);
        customers.get(customers.size()-1).addTransaction(transaction);
        return 0;
    }

    public Customer getCustomerAtIndex(int index){
        return customers.get(index);
    }

    public Customer getCustomerUsingName(String name){
        for (Customer customer: customers) {
            if(customer.getName().equals(name))
            {
                return customer;
            }
        }
        return null;
    }

    public int addTransaction2CustomerUsingCustomer(Customer customer,double transaction){
        return addTransaction2CustomerUsingName(customer.getName(),transaction);
    }

    public int addTransaction2CustomerUsingName(String name,double transaction){
        for (Customer customer: customers) {
            if(customer.getName().equals(name))
            {
                customer.addTransaction(transaction);
                return 0;
            }
        }
        return -1;
    }

}
