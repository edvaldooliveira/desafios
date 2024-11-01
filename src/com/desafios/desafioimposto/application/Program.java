package com.desafios.desafioimposto.application;

import com.desafios.desafioimposto.entities.RendaAnualCalculadora;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("\nRenda anual com salário: ");
        double rendaAnualSalario = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double rendaAnualServico = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double rendaAnualCapital = sc.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = sc.nextDouble();

        // Criação do objeto calculadora
        RendaAnualCalculadora calculadora = new RendaAnualCalculadora(rendaAnualSalario, rendaAnualServico, rendaAnualCapital);

        // Cálculo dos impostos
        double impostoSalario = calculadora.impostoSalario(rendaAnualSalario);
        double impostoServico = calculadora.impostoServico(rendaAnualServico);
        double impostoCapital = calculadora.impostoCapital(rendaAnualCapital);

        double impostoBrutoTotal = impostoSalario + impostoServico + impostoCapital;

        // Cálculo das deduções
        double maximoDedutivel = impostoBrutoTotal * 0.3;
        double gastosDedutiveis = Math.min(gastosMedicos + gastosEducacionais, maximoDedutivel);
        double gDedutiveis =  gastosEducacionais + gastosMedicos;
        double impostoFinal = impostoBrutoTotal - gastosDedutiveis;

        // Exibição do relatório
        System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA\n");
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n",  impostoCapital);

        System.out.println("\nDEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f\n", gDedutiveis);

        System.out.println("\nRESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoBrutoTotal);
        System.out.printf("Abatimento: %.2f\n", gastosDedutiveis);
        System.out.printf("Imposto devido: %.2f\n", impostoFinal);

        sc.close();
    }

}