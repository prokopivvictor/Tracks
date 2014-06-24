package com.epam.vp.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Track> defaultPlaylist = new ArrayList<Track>();
    private List<Track> sortedPlaylist = new ArrayList<Track>();

    public List<Track> getSortedPlaylist() {
        return sortedPlaylist;
    }

    public List<Track> getDefaultPlaylist() {
        return defaultPlaylist;
    }

    public void generatePlaylist(int size) {
        for (int i = 0; i < size; i++) {
            defaultPlaylist.add(TracksFactory.trackFactory(1 + (int) (Math.random() * ((2 - 1) + 1))));
        }
    }

    public void sortPlaylist(List<Track> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getClass().equals(Song.class))
                sortedPlaylist.add(list.get(i));


        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getClass().equals(Lecture.class))
                sortedPlaylist.add(list.get(i));

        }
    }
    public Double getTotalDuration(List<Track> list) {
        double duration = 0;
        for (int i = 0; i < list.size(); i++) {
            duration += list.get(i).getDuration();
        }
        duration = new BigDecimal(duration).setScale(2, RoundingMode.UP).doubleValue();
        return duration;
    }
}
