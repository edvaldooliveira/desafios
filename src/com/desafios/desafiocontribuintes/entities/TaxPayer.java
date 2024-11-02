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
    public double impostoSobreSalario(double salaryIncome) {
        double rendaMensal = salaryIncome / 12;
        if (rendaMensal < 3000) {
            return 0.0;
        } else if (rendaMensal < 5000) {
            return salaryIncome * 0.1;
        } else {
            return salaryIncome * 0.2;
        }
    }
    public double salaryTax() {
        return capitalIncome * 0.2;
    }
    public double servicesTax() {
        return servivesIncome * 0.15;
    }
    public double grossTax() {
        return salaryTax() + servicesTax() + capitalIncome;
    }
    public double taxRebate() {
        double totalDeduction = healthSpending + educationSpending;
        double maxRebate = grossTax() * 0.3;
        return Math.min(totalDeduction, maxRebate);
    }
    public double netTax() {
        return grossTax() - taxRebate();
    }
}
