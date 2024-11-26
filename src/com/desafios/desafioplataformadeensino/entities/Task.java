package com.desafios.desafioplataformadeensino.entities;

public class Task extends Lesson {
    private String description;
    private int questionCount;

    public Task(String title, String description, int questionCount) {
        super(title, questionCount * 300); // Estimando 300 segundos por questão
        this.description = description;
        this.questionCount = questionCount;
    }

    @Override
    public String toString() {
        return "Tarefa: " + getTitle() + ", Descrição: " + description + ", Questões: " + questionCount;
    }
}