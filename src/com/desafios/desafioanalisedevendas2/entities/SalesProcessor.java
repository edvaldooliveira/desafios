package com.desafios.desafioanalisedevendas2.entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesProcessor {

    public List<Sale> readSalesFromFile(String filePath) throws IOException {
        List<Sale> salesList = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String seller = fields[2].trim();
                Double total = Double.parseDouble(fields[4].trim());

                salesList.add(new Sale(seller, total));
            }
        }

        return salesList;
    }

    public Map<String, Double> calculateTotalSalesBySeller(List<Sale> salesList) {
        Map<String, Double> totalSalesBySeller = new HashMap<>();

        for (Sale sale : salesList) {
            totalSalesBySeller.put(sale.getSeller(),
                    totalSalesBySeller.getOrDefault(sale.getSeller(), 0.0) + sale.getTotal());
        }

        return totalSalesBySeller;
    }
}