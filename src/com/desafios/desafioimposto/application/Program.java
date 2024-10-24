package com.desafios.desafioimposto.application;

import com.desafios.desafioimposto.entities.rendaMensal;
import com.desafios.desafioimposto.entities.CalcSalario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double salário = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double pestServico = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double ganhoCapital = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        double GastosMedio = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        double GastosEducacionais = sc.nextDouble();

        sc.close();



    }
}
