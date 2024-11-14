package com.desafios.desafioempregados.entities;

public class Employee {
    private String name;
    private double salary;

    public Employee() {
    }
    public Employee(String name) {
        setName(name); // Validação ao definir o nome
    }

    public Employee(String name, double salary) {
        setName(name); // Validação ao definir o nome
        setSalary(salary); // Validação ao definir o salário
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
    }
}
