package com.desafios.desafioanalisedevendas1.entities;

import java.util.Objects;

public class Sale {
    private Integer month;
    private Integer year;
    private String seller;
    private Integer items;
    private Double total;

    public Sale(Integer month, Integer year, String seller, Integer items, Double total) {
        this.month = month;
        this.year = year;
        this.seller = seller;
        this.items = items;
        this.total = total;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    public String getSeller() {
        return seller;
    }

    public Integer getItems() {
        return items;
    }

    public Double getTotal() {
        return total;
    }

    public Double getAveragePrice() {
        return total / items;
    }

    @Override
    public String toString() {
        return String.format("%d/%d, %s, %d, %.2f, pm = %.2f",
                month, year, seller, items, total, getAveragePrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(month, sale.month) && Objects.equals(year, sale.year) &&
                Objects.equals(seller, sale.seller) && Objects.equals(items, sale.items) &&
                Objects.equals(total, sale.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, year, seller, items, total);
    }
}