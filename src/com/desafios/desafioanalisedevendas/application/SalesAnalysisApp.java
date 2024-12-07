package com.desafios.desafioanalisedevendas.application;

import com.desafios.desafioanalisedevendas.entities.Sale;
import com.desafios.desafioanalisedevendas.entities.SalesProcessor;

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
            // Lendo vendas do arquivo
            List<Sale> salesList = processor.readSalesFromFile(filePath);

            // Obtendo as cinco maiores vendas de 2016
            List<Sale> topSales2016 = processor.filterTopSalesOf2016(salesList);

            // Exibir as cinco maiores vendas
            System.out.println("\nCinco primeiras vendas de 2016 de maior preço médio:");
            for (Sale sale : topSales2016) {
                System.out.println(sale);
            }

            // Cálculo do total vendido pelo vendedor Logan nos meses 1 e 7
            Double totalLogan = processor.calculateLoganTotal(salesList);
            System.out.printf("\nValor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f%n", totalLogan);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
