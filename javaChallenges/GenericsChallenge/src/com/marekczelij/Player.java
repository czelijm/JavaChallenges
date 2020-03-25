package com.marekczelij;

public class Player extends TeamMember{
    private String sportDiscipline;

    public Player(String firstName, String surname, String sportDiscipline) {
        super(firstName, surname);
        this.sportDiscipline = sportDiscipline;
    }

    public String getSportDiscipline() {
        return sportDiscipline;
    }

    public void setSportDiscipline(String sportDiscipline) {
        this.sportDiscipline = sportDiscipline;
    }
}
