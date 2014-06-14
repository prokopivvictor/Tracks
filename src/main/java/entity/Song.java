package entity;

public class Song extends Track {
    private String title;
    private String band;
    private String album;
    private Integer year;

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

    public Song(String title, String band, String album, Integer year) {
        this.title = title;
        this.band = band;
        this.album = album;
        this.year = year;
    }
}


