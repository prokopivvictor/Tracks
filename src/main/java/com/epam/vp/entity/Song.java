package com.epam.vp.entity;

import java.util.ArrayList;

public class Song extends Track {
    private String title;
    private String band;
    private String album;
    private Integer year;

    private Song(Builder builder) {
        title = builder.title;
        band = builder.band;
        album = builder.album;
        year = builder.year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public static class Builder {
        private String title;
        private String band;
        private String album;
        private Integer year;

        public Builder(String title, String band) {
            this.title = title;
            this.band = band;
        }

        public Builder album(String value) {
            album = value;
            return this;
        }

        public Builder year(Integer value) {
            year = value;
            return this;
        }

        public Song build() {
            return new Song(this);
        }
    }

}


