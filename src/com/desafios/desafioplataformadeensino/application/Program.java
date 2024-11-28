package com.desafios.desafioplataformadeensino.application;

import com.desafios.desafioplataformadeensino.entities.ContentLesson;
import com.desafios.desafioplataformadeensino.entities.Lesson;
import com.desafios.desafioplataformadeensino.entities.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas aulas tem o curso? ");
        int numLessons = sc.nextInt();
        sc.nextLine();

        List<Lesson> lessons = new ArrayList<>();

        for (int i = 1; i <= numLessons; i++) {
            System.out.println("Dados da " + i + "ª aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Título: ");
            String title = sc.nextLine();

            if (type == 'c') {
                System.out.print("URL do vídeo: ");
                String videoUrl = sc.nextLine();

                System.out.print("Duração em segundos: ");
                int duration = sc.nextInt();
                sc.nextLine();

                lessons.add(new ContentLesson(title, videoUrl, duration));
            } else if (type == 't') {
                System.out.print("Descrição: ");
                String description = sc.nextLine();

                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();
                sc.nextLine();

                lessons.add(new Task(title, description, questionCount));
            }
        }
        
        int totalDuration = 0;
        for (Lesson lesson : lessons) {
            totalDuration += lesson.getDuration();
        }

        System.out.println("\nDURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");
        sc.close();
    }
}