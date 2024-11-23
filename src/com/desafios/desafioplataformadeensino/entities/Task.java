package com.desafios.desafioplataformadeensino.entities;

public class Task {
    private String description;
    private int questionCount;

    // Construtor padrão
    public Task() {
    }

    // Construtor com parâmetros
    public Task(String description, int questionCount) {
        this.description = description;
        this.questionCount = questionCount;
    }

    // Getters e setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    // Método toString para exibir informações da tarefa
    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", questionCount=" + questionCount +
                '}';
    }
}