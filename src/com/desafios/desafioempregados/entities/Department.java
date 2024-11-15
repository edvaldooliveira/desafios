package com.desafios.desafioempregados.entities;


import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private int payDay;
    private List<Employee> employees;

    public Department(String name, int payDay) {
        this.name = name;
        this.payDay = payDay;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double payroll() {
        double total = 0.0;
        for (Employee emp : employees) {
            total += emp.getSalary();
        }
        return total;
    }

    public int getPayDay() {
        return payDay;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}