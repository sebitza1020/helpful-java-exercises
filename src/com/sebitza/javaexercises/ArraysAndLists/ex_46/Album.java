package com.sebitza.javaexercises.ArraysAndLists.ex_46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        Song song = findSong(songTitle);
        if (song == null) {
            this.songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song checkSong : this.songs) {
            if (checkSong.getTitle().equals(songTitle)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playList) {
        int index = trackNo - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNo);
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song checkSong = findSong(songTitle);
        if (checkSong != null) {
            playList.add(checkSong);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in this album");
        return false;
    }
}
