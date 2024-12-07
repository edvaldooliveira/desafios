package com.desafios.desafioanalisedevendas2.entities;

import java.util.Objects;

public class Sale {
    private String seller;
    private Double total;

    public Sale(String seller, Double total) {
        this.seller = seller;
        this.total = total;
    }

    public String getSeller() {
        return seller;
    }

    public Double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return String.format("%s - R$ %.2f", seller, total);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(seller, sale.seller) && Objects.equals(total, sale.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seller, total);
    }
}