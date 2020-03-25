package com.marekczelij;

public class StaffMember extends TeamMember{
    private String function = "";

    public StaffMember(String firstName, String surname, String function) {
        super(firstName, surname);
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
