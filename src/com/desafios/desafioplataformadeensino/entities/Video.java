package com.desafios.desafioplataformadeensino.entities;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private String url;
    private int seconds;

    // Construtor padrão
    public Video() {
    }

    // Construtor com parâmetros
    public Video(String url, int seconds) {
        this.url = url;
        this.seconds = seconds;
    }

    // Getters e Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // Método para converter segundos em minutos e segundos
    public String getFormattedDuration() {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%d min %d sec", minutes, remainingSeconds);
    }

    // Método toString para exibir informações do vídeo
    @Override
    public String toString() {
        return "Video{" +
                "url='" + url + '\'' +
                ", duration=" + getFormattedDuration() +
                '}';
    }
}