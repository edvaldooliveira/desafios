package com.desafios.desafiocontribuintes.application;

import com.desafios.desafiocontribuintes.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();
        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
             System.out.println("\n");
            System.out.println("Digite os dados do " + i + "º contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();

            TaxPayer taxpayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            taxPayers.add(taxpayer);
        }

        System.out.println();
        System.out.println("RELATÓRIO DE IMPOSTO:");
        for (int i = 0; i < taxPayers.size(); i++) {
            TaxPayer taxpayer = taxPayers.get(i);
            System.out.printf("Contribuinte %d:%n", i + 1);
            System.out.printf("Imposto bruto: %.2f%n", taxpayer.grossTax());
            System.out.printf("Abatimento: %.2f%n", taxpayer.taxRebate());
            System.out.printf("Imposto devido: %.2f%n", taxpayer.netTax());
            System.out.println();
        }
        sc.close();
    }
}

