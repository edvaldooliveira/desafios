package com.desafios.desafioplataformadeensino.entities;
public class Lesson {
    private String title;
    private int duration;

    public Lesson(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}