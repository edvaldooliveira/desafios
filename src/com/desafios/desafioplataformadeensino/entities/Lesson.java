package com.desafios.desafioplataformadeensino.entities;

public class Lesson {
    private String title;
    public int durantion;

    public Lesson() {
    }

    public Lesson(String title, int durantion) {
        this.title = title;
        this.durantion = durantion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurantion() {
        return durantion;
    }

    public void setDurantion(int durantion) {
        this.durantion = durantion;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "title='" + title + '\'' +
                ", durantion=" + durantion +
                '}';
    }
}
