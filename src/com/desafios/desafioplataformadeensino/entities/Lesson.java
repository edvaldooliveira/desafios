package com.desafios.desafioplataformadeensino.entities;

public class Lesson {
    private String title;
    private int duration; // Corrigido o nome do atributo

    // Construtor padrão
    public Lesson() {
    }

    // Construtor com parâmetros
    public Lesson(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Getters e setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() { // Nome do método também corrigido
        return duration;
    }

    public void setDuration(int duration) { // Nome do método também corrigido
        this.duration = duration;
    }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "Lesson{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}