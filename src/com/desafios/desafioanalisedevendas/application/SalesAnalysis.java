package com.desafios.desafioanalisedevendas.application;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class SalesAnalysis {

    // Classe interna para representar uma venda
    static class Sale {
        int month;
        int year;
        String seller;
        int items;
        double total;

        // Construtor
        public Sale(int month, int year, String seller, int items, double total) {
            this.month = month;
            this.year = year;
            this.seller = seller;
            this.items = items;
            this.total = total;
        }

        // Método para calcular o preço médio
        public double getAveragePrice() {
            return total / items;
        }

        // Representação em String para exibição
        @Override
        public String toString() {
            return String.format("%d/%d, %s, %d, %.2f, pm = %.2f",
                    month, year, seller, items, total, getAveragePrice());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar o caminho do arquivo
        System.out.print("Entre o caminho do arquivo: ");
        String filePath = sc.nextLine();

        List<Sale> salesList = new ArrayList<>();

        // Leitura do arquivo e tratamento de exceções
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                int month = Integer.parseInt(fields[0].trim());
                int year = Integer.parseInt(fields[1].trim());
                String seller = fields[2].trim();
                int items = Integer.parseInt(fields[3].trim());
                double total = Double.parseDouble(fields[4].trim());

                salesList.add(new Sale(month, year, seller, items, total));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // Filtragem das vendas de 2016
        List<Sale> sales2016 = salesList.stream()
                .filter(s -> s.year == 2016)
                .sorted(Comparator.comparingDouble(Sale::getAveragePrice).reversed())
                .limit(5)
                .collect(Collectors.toList());

        // Exibir as cinco maiores vendas
        System.out.println("\nCinco primeiras vendas de 2016 de maior preço médio:");
        for (Sale sale : sales2016) {
            System.out.println(sale);
        }

        // Cálculo do total vendido pelo vendedor Logan nos meses 1 e 7
        double totalLogan = salesList.stream()
                .filter(s -> s.seller.equalsIgnoreCase("Logan") && (s.month == 1 || s.month == 7))
                .mapToDouble(s -> s.total)
                .sum();

        System.out.printf("\nValor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f%n", totalLogan);
        sc.close();
    }
}
