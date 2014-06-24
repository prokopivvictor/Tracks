package com.epam.vp.entity;

public class Lecture extends Track {
    private String author;
    private String reader;
    private String topic;
    private String title;

    private Lecture(Builder builder) {
        author = builder.author;
        reader = builder.reader;
        topic = builder.topic;
        title = builder.title;
        setDuration(builder.duration);
        setFile_size(builder.file_size);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static class Builder {
        private String author = DataStorage.getRandomValue(DataStorage.getLectureAuthorStorage());
        private String topic = DataStorage.getRandomValue(DataStorage.getLectureTopicStorage());
        private Double duration = 2 + (Math.random() * ((5 - 2) + 1));
        private Double file_size = 10 + (Math.random() * ((10 - 5) + 1));
        private String reader;
        private String title;

        public Lecture build() {
            return new Lecture(this);
        }
    }

}
