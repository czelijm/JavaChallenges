package com.marekczelij;
import java.util.Collections;
import java.util.List;

public abstract class Spiewak implements Comparable<Spiewak>{
    private String surname ="";
    private int startingNumber;
    private static int counter =0;
    public String startingSong = "";

    public Spiewak(String surname) {
        this.surname = surname;
        startingNumber = counter;
        counter++;
    }

    public abstract String spiewaj();

    public static Spiewak mostLouder(List<Spiewak> s){
        List<Spiewak> s1=s;

        Collections.sort(s1,Collections.reverseOrder());
        return s1.get(0);
    }

    private int countCapsLetters(String s){
        int countCaps = 0;
        for (char c : s.toCharArray()) {
            if(Character.isUpperCase(c)){
                countCaps++;
            }
        }
        return countCaps;
    }

    private int capsOfMySong(){
        return countCapsLetters(this.startingSong);
    }

    public int capsOfMySongTest(){
        return capsOfMySong();
    }

    @Override
    public String toString() {
        return "Spiewak{" +
                "surname='" + surname + '\'' +
                ", startingSong='" + startingSong + '\'' +
                '}';
    }

    @Override
    public int compareTo(Spiewak o) {
        int result = Integer.compare(this.capsOfMySong(),o.capsOfMySong());
//        if (result == 0){
//            if(this.startingNumber>o.startingNumber)
//                return 1;
//            else return -1;
//        }
        return result;
    }
}
