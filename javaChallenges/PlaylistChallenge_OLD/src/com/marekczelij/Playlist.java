package com.marekczelij;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private String name;
    private LinkedList<Song> songs = new LinkedList<Song>();

    public Playlist(String name) {
        this.name = name;
    }

    public int addSongToPlaylist(Song s){
        for (Song song:songs) {
            if (song.getName().equals(s.getName()) && song.getDurationTime()==s.getDurationTime()){
                System.out.println("Song exist in playlist");
                return -1;
            }
        }

        songs.add(s);
        return 0;
    }

    public void playSongFromPlayList(Song song){
        System.out.println("Now playing: "+song.getName()+" "+song.getDurationTime());
    }

    public void printMenu(){
        System.out.println("press 0 to quit \n" +
                "press 1 to play next song \n" +
                "press 2 to play previous song \n" +
                "press 3 to revind song \n" +
                "press 4 to quit playlist \n"
        );
    }

    public void playEntirePlaylist(LinkedList<Song> songs){
        if(songs.isEmpty()){
            System.out.println("Playlist is empty!!!");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> iterator = songs.listIterator();
        boolean playMusic=true;
        boolean isGoingForward=true;


        while(playMusic){
            printMenu();
            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise){
                case 0:
                    playMusic=false;
                    System.out.println("Quit playing sons");
                    break;
                case 1:
                    if(!isGoingForward){
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        isGoingForward=true;
                    }
                    if(iterator.hasNext()){
                        playSongFromPlayList(iterator.next());
                    }
                    else {
                        System.out.println("Reached end of the playlist");
                        isGoingForward=false;
                    }
                    break;
                case 2:
                    if(isGoingForward){
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        isGoingForward=false;
                    }
                    if(iterator.hasPrevious()){
                        playSongFromPlayList(iterator.previous());
                    }
                    else {
                        System.out.println("Reached begging of the playlist");
                        isGoingForward=true;
                    }
                    break;
                case 3:
                    if(isGoingForward){
                        if(iterator.hasPrevious()) {
                            playSongFromPlayList(iterator.previous());
                            iterator.next();
                        }
                    }
                    else{
                        if(iterator.hasNext()) {
                            playSongFromPlayList(iterator.next());
                            iterator.previous();
                        }
                    }
                    break;
                case 4:
                    printMenu();
                    break;

            }
        }


    }

    public void playEntirePlaylist() {
        playEntirePlaylist(this.songs);
    }



    }
