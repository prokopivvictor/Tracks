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
        private String author;
        private String reader;
        private String topic;
        private String title;

        public Builder(String author, String topic) {
            this.author = author;
            this.topic = topic;
        }

        public Builder reader(String value) {
            reader = value;
            return this;
        }

        public Builder title(String value) {
            title = value;
            return this;
        }

        public Lecture build() {
            return new Lecture(this);
        }
    }

}
