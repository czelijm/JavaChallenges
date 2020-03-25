package com.marekczelij;

import java.util.LinkedList;

public class Album {
    private String name;
    private LinkedList<Song> songs = new LinkedList<Song>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

}
