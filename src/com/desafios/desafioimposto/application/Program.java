package com.desafios.desafioimposto.application;

import com.desafios.desafioimposto.entities.rendaMensal;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rendaMensal rendaMensal = new rendaMensal();


        System.out.print("\nRenda anual com salário: ");
        double rendaAnual = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double prestacaoServico = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double ganhoCapital = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        double gastosMedicos = sc.nextDouble();


      double resolt =   rendaMensal.impostoSalario(rendaAnual);
      double resoltServico =  rendaMensal.impostoServicos(prestacaoServico);
      double resoltCapital = rendaMensal.impostoCapital(ganhoCapital);
      double resoltDedutivies = rendaMensal.GastosDedutiveis(gastosMedicos);


        System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA\n");
        System.out.println("CONSOLIDADO DE RENDA: ");


        System.out.printf("Imposto sobre salário: %.2f\n", resolt);
        System.out.printf("Imposto sobre serviços: %.2f\n", resoltServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n ", resoltCapital);
        System.out.println("\nDEDUÇÕES: ");
        System.out.printf("Máximo dedutível: %.2f\n ", resoltDedutivies );


        sc.close();



    }
}
