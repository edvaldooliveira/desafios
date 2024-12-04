package com.desafios.desafioanalisedevendas.entities;

public class Sale {
    private Integer month;
    private Integer year;
    private String seller;
    private Integer items;
    private double total;

    // Construtor padrão
    public Sale() {
    }

    // Construtor com parâmetros
    public Sale(Integer month, Integer year, String seller, Integer items, double total) {
        this.month = month;
        this.year = year;
        this.seller = seller;
        this.items = items;
        this.total = total;
    }

    // Getters e Setters
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Método toString para exibir informações da venda
    @Override
    public String toString() {
        return "Sale{" +
                "month=" + month +
                ", year=" + year +
                ", seller='" + seller + '\'' +
                ", items=" + items +
                ", total=" + total +
                '}';
    }
}

