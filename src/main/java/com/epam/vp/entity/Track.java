package com.epam.vp.entity;

public abstract class Track {
    private String file_name;
    private Double duration;
    private Double file_size;

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getFile_size() {
        return file_size;
    }

    public void setFile_size(Double file_size) {
        this.file_size = file_size;
    }
}
