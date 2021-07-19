package com.sebitza.javaexercises.challenges.innerclasses;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String songTitle, double songDuration) {
        return this.songs.add(new Song(songTitle, songDuration));
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playList) {
        Song checkSong = this.songs.findSong(trackNo);
        if (checkSong != null) {
            playList.add(checkSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNo);
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song checkSong = songs.findSong(songTitle);
        if (checkSong != null) {
            playList.add(checkSong);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String songTitle) {
            for (Song checkSong : this.songs) {
                if (checkSong.getTitle().equals(songTitle)) {
                    return checkSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNo) {
            int index = trackNo - 1;
            if((index > 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
