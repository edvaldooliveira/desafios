package com.desafios.desafiocontribuintes.entities;

public class TaxPayer {
    private Double salaryIncome;
    private Double servivesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;

    public TaxPayer() {
    }

    public TaxPayer(Double salaryIncome, Double servivesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servivesIncome = servivesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(Double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public Double getServivesIncome() {
        return servivesIncome;
    }

    public void setServivesIncome(Double servivesIncome) {
        this.servivesIncome = servivesIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(Double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(Double educationSpending) {
        this.educationSpending = educationSpending;
    }

    
    //Métodos para serem implementados
    public double salaryTax() {
        return 0;
    }

    public double servicesTax() {
        return 0;
    }

    public double grossTax() {
        return 0;
    }

    public double taxRebate() {
        return 0;
    }

    public double netTax() {
        return 0;
    }

}
