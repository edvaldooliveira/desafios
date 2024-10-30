package com.desafios.desafioatletas.application;

import com.desafios.desafioatletas.entities.Atleta;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AtletaProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Atleta> atletas = new ArrayList<>();


        System.out.print("Qual a quantidade de atletas? ");
        int numeroAtletas = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numeroAtletas; i++) {
            System.out.printf("Digite os dados do atleta número %d:\n", i);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            char sexo;
            while (true) {
                System.out.print("Sexo (M/F): ");
                sexo = sc.next().toUpperCase().charAt(0);
                if (sexo == 'M' || sexo == 'F') {
                    break;
                } else {
                    System.out.println("Valor inválido! Favor digitar F ou M.");
                }
            }

            double altura;
            while (true) {
                System.out.print("Altura: ");
                altura = sc.nextDouble();
                if (altura > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido! Favor digitar um valor positivo.");
                }
            }

            double peso;
            while (true) {
                System.out.print("Peso: ");
                peso = sc.nextDouble();
                if (peso > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido! Favor digitar um valor positivo.");
                }
            }

            sc.nextLine();  // Limpar o buffer
            atletas.add(new Atleta(nome, sexo, altura, peso));
        }

        // Relatório
        System.out.println("\nRELATÓRIO:");
        double somaPesos = 0;
        double alturaTotalMulheres = 0;
        int countMulheres = 0;
        int countHomens = 0;
        Atleta atletaMaisAlto = atletas.get(0);

        for (Atleta atleta : atletas) {
            somaPesos += atleta.getPeso();

            if (atleta.getSexo() == 'F') {
                alturaTotalMulheres += atleta.getAltura();
                countMulheres++;
            } else {
                countHomens++;
            }

            if (atleta.getAltura() > atletaMaisAlto.getAltura()) {
                atletaMaisAlto = atleta;
            }
        }

        double pesoMedio = somaPesos / atletas.size();
        double alturaMediaMulheres = countMulheres > 0 ? alturaTotalMulheres / countMulheres : 0;
        double porcentagemHomens = ((double) countHomens / atletas.size()) * 100;

        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
        System.out.println("Atleta mais alto: " + atletaMaisAlto.getNome());
        System.out.printf("Porcentagem de homens: %.1f %%\n", porcentagemHomens);
        System.out.printf("Altura média das mulheres: %.2f\n", alturaMediaMulheres);

        sc.close();
    }
}
