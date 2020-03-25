package com.marekczelij;

import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    //private LinkedList<Song> songs = new LinkedList<Song>();
    private SongList songs = new SongList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SongList getSongs() {
        return songs;
    }

    public Album(String name) {
        this.name = name;
    }

    public Song findSongInTheAlbum(String searchedName){

        for (Song song:getSongs().getSongs()) {
            if (song.getName().equals(searchedName)){
                System.out.println("Song exist in playlist");
                return song;
            }
        }
        System.out.println("Song not exist in the album");
        return null;
    }

    public class SongList
    {
        private List<Song> songs = new LinkedList<Song>();
        public int addSongToList(Song s){
            for (Song song:songs) {
                if (song.getName().equals(s.getName()) && song.getDurationTime()==s.getDurationTime()){
                    System.out.println("Song exist in playlist");
                    return -1;
                }
            }
            songs.add(s);
            return 0;
        }

        public List<Song> getSongs() {
            return songs;
        }
    }
}
