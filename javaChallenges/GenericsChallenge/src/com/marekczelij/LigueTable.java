package com.marekczelij;



import java.util.Collections;
import java.util.ArrayList;

public class LigueTable<T extends Team> {
    private String name;
    private String sport;
    private ArrayList<T> table= new ArrayList<>();

    public LigueTable(String name, String sport) {
        this.name = name;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int addTeam2RankingTable(T t){
        if (!table.isEmpty()){
            for (Team tt: table
                 ) {
                if(tt.getName().equals(t.getName()) ){
                    System.out.println("Team exist");
                    return -1;
                }
            }
        }
        System.out.println("Team added");
        table.add(t);
        return 0;
    }

    public void showRanking(){
        Collections.sort(table);
        for (Team t:table
             ) {
            System.out.println(t.getName() +" "+t.ranking());
        }
    }

}
