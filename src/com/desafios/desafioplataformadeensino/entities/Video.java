package com.desafios.desafioplataformadeensino.entities;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private String url;
    private int seconds;


    public Video() {
    }


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


    public String getFormattedDuration() {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%d min %d sec", minutes, remainingSeconds);
    }


    @Override
    public String toString() {
        return "Video{" +
                "url='" + url + '\'' +
                ", duration=" + getFormattedDuration() +
                '}';
    }
}