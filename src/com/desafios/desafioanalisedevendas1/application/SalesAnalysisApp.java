package com.desafios.desafioanalisedevendas1.application;

import com.desafios.desafioanalisedevendas1.entities.Sale;
import com.desafios.desafioanalisedevendas1.entities.SalesProcessor;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SalesAnalysisApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalesProcessor processor = new SalesProcessor();


        System.out.print("Entre o caminho do arquivo: ");
        String filePath = sc.nextLine();

        try {
           
            List<Sale> salesList = processor.readSalesFromFile(filePath);

           
            List<Sale> topSales2016 = processor.filterTopSalesOf2016(salesList);

           
            System.out.println("\nCinco primeiras vendas de 2016 de maior preço médio:");
            for (Sale sale : topSales2016) {
                System.out.println(sale);
            }

           
            Double totalLogan = processor.calculateLoganTotal(salesList);
            System.out.printf("\nValor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f%n", totalLogan);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
