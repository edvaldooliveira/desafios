package com.desafios.desafioanalisedevendas1.entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SalesProcessor {

    public List<Sale> readSalesFromFile(String filePath) throws IOException {
        List<Sale> salesList = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                Integer month = Integer.parseInt(fields[0].trim());
                Integer year = Integer.parseInt(fields[1].trim());
                String seller = fields[2].trim();
                Integer items = Integer.parseInt(fields[3].trim());
                Double total = Double.parseDouble(fields[4].trim());

                salesList.add(new Sale(month, year, seller, items, total));
            }
        }

        return salesList;
    }

    public List<Sale> filterTopSalesOf2016(List<Sale> salesList) {
        return salesList.stream()
                .filter(s -> s.getYear().equals(2016))
                .sorted((s1, s2) -> s2.getAveragePrice().compareTo(s1.getAveragePrice()))
                .limit(5)
                .toList();
    }

    public Double calculateLoganTotal(List<Sale> salesList) {
        return salesList.stream()
                .filter(s -> s.getSeller().equalsIgnoreCase("Logan") &&
                        (s.getMonth().equals(1) || s.getMonth().equals(7)))
                .mapToDouble(Sale::getTotal)
                .sum();
    }
}
