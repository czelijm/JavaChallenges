package com.marekczelij;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name="";
    private ArrayList<T> players = new ArrayList<>();
    private ArrayList<StaffMember> staffMembers = new ArrayList<>();
    private StatisticsHistory statisticsHistory = new StatisticsHistory();

    public Team(String name) {
        this.name = name;
    }

    public int addMember(StaffMember player){
        for (TeamMember p : staffMembers) {
            if(p.equals(player.getFirstName()) && p.equals(player.getSurname())){
                System.out.println("staff member in the team");
                return -1;
            }
        }
        staffMembers.add(player);
        System.out.println("staff member added");
        return 0;
    }

    public int addPlayer(T player){
        for (TeamMember p : players) {
            if(p.equals(player.getFirstName()) && p.equals(player.getSurname())){
                System.out.println("Player exist in the team");
                return -1;
            }
        }
        players.add(player);
        System.out.println("Player added");
        return 0;
    }

    public void win(){
        statisticsHistory.win++;
        System.out.println(name+"win!!!");
    }


    public void lose(){
        statisticsHistory.loses++;
        System.out.println(name+"lose!!!");
    }

    public void draw(){
        statisticsHistory.draws++;
        System.out.println(name+"draw!!!");
    }

    public StatisticsHistory getStatisticsHistory() {
        return statisticsHistory;
    }

    public int ranking(){
        return 2*statisticsHistory.win+statisticsHistory.draws;
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.ranking()>o.ranking()){
            return -1;
        } else if (this.ranking()==o.ranking()){
            return 1;
        } else {
            return 0;
        }
        //return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
