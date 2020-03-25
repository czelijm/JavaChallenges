package com.marekczelij;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Song rocketmam =new Song("RocketMan",3.30);
        Song backInblack =new Song("Back in Black",3.40);
        Song runningInThe90 = new Song("Running in the 90's",4.30);

        Playlist myFavorite = new Playlist("myFavorite");

        myFavorite.addSongToPlaylist(rocketmam);
        myFavorite.addSongToPlaylist(rocketmam);
        myFavorite.addSongToPlaylist(backInblack);
        myFavorite.addSongToPlaylist(runningInThe90);

        myFavorite.playEntirePlaylist();
    }

    /*TO DO
    * add validation of time duration
    * change printing duration time
    * simulate playing
    * add counter to count seconds
    * make conversion from mins:secs to seconds
    * add feature that provide add entire album at once
    * */
}
