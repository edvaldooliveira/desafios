package com.desafios.desafioplataformadeensino.entities;

public class ContentLesson extends Lesson {
    private String videoUrl;

    public ContentLesson(String title, String videoUrl, int duration) {
        super(title, duration);
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "Conteúdo: " + getTitle() + " (" + videoUrl + "), Duração: " + getDuration() + " segundos";
    }
}