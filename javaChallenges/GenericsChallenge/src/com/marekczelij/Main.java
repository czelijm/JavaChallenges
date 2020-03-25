package com.marekczelij;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LigueTable<Team<UnderwaterHockey>> superLigue = new LigueTable<>("Super Ligue","Underwater Hockey");

        Team<UnderwaterHockey> dolphins = new Team<>("Dolphins");
        Team<UnderwaterHockey> pinguins = new Team<>("Pinguins");
        Team<UnderwaterHockey> sloths = new Team<>("Sloths");

        superLigue.addTeam2RankingTable(dolphins);
        superLigue.addTeam2RankingTable(sloths);
        superLigue.addTeam2RankingTable(pinguins);

        Team<ChessBoxing> lemmurs = new Team<>("Lemmurs");

        //superLigue.addTeam2RankingTable(lemmurs); error ok



        dolphins.lose();
        pinguins.draw();
        sloths.win();
        sloths.win();



        superLigue.showRanking();

    }
}
