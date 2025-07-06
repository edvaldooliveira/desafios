package com.desafios.desafioanalisedevendas2.application;

import com.desafios.desafioanalisedevendas2.entities.Sale;
import com.desafios.desafioanalisedevendas2.entities.SalesProcessor;

import java.io.IOException;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SalesAnalysisApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalesProcessor processor = new SalesProcessor();

       
        System.out.print("Entre o caminho do arquivo: ");
        String filePath = sc.nextLine();

        try {
           
            List<Sale> salesList = processor.readSalesFromFile(filePath);

           
            Map<String, Double> totalSalesBySeller = processor.calculateTotalSalesBySeller(salesList);

           
            System.out.println("\nTotal de vendas por vendedor:");
            totalSalesBySeller.forEach((seller, total) ->
                    System.out.printf("%s - R$ %.2f%n", seller, total));

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
