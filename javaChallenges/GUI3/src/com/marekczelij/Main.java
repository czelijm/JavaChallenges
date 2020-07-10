package com.marekczelij;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Spiewak s1 = new Spiewak("JOJO"){
            @Override
            public String spiewaj() {
                System.out.println(startingSong);
                return null;
            }
        };
        s1.startingSong="Star platinum!!!";

        Spiewak s2 = new Spiewak("DIO"){
            @Override
            public String spiewaj() {
                System.out.println(startingSong);
                return null;
            }
        };
        s2.startingSong="ZA WARDO!!!!";

        Spiewak s3 = new Spiewak("SCORPIONS"){
            @Override
            public String spiewaj() {
                System.out.println(startingSong);
                return null;
            }
        };
        s3.startingSong="WIND OF CHANGE!!!!";

        Spiewak s4 = new Spiewak("MC"){
            @Override
            public String spiewaj() {
                System.out.println(startingSong);
                return null;
            }
        };
        s4.startingSong="XXXDDDDXXXDDDXXXXDDD!!!!";


        ArrayList<Spiewak> sp = new ArrayList<>();
        sp.add(s1);
        sp.add(s2);
        sp.add(s4);
        sp.add(s3);

        sp.forEach(s->System.out.println(s.toString()));

        System.out.println(Spiewak.mostLouder(sp).toString());
        
    }
}
