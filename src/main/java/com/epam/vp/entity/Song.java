package com.epam.vp.entity;

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
        setDuration(builder.duration);
        setFile_size(builder.file_size);

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
        private String title = DataStorage.getRandomValue(DataStorage.getTitlesStorage());
        private String band = DataStorage.getRandomValue(DataStorage.getBandsStorage());
        private String album = DataStorage.getRandomValue(DataStorage.getAlbumsStorage());
        private Integer year = 2000 + (int) (Math.random() * ((2014 - 2000) + 1));
        private Double duration = 2 + (Math.random() * ((5 - 2) + 1));
        private Double file_size = 10 + (Math.random() * ((10 - 5) + 1));

        public Song build() {
            return new Song(this);
        }
    }

}


