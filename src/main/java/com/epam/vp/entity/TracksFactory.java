package com.epam.vp.entity;

import java.util.ArrayList;
import java.util.List;

public class TracksFactory {
    /*private static List<Track> playlist = new ArrayList<Track>();

    public static List<Track> getDefaultPlaylist() {
        return playlist;
    }

    public static List trackFactory() {
        for (int i = 0; i < 10; i++) {
            int value = 1 + (int) (Math.random() * ((2 - 1) + 1));
            if (value == 1) {
                Song song = new Song.Builder().build();
                playlist.add(song);
            } else {
                Lecture lec = new Lecture.Builder().build();
                playlist.add(lec);
            }
        }
        return playlist;
    }*/

    public static Track trackFactory(int i) {
        if (i == 1) return new Song.Builder().build();
        else return new Lecture.Builder().build();
    }
}
