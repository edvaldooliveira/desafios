package com.desafios.desafioempregados.entities;


import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private int payDay;
    private List<Employee> employees;

    public Department() {
        employees = new ArrayList<>();
    }

    public Department(String name, int payDay) {
        setName(name); // Validação de nome
        setPayDay(payDay); // Validação de payDay
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nome do departamento não pode ser nulo ou vazio");
        }
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        if (payDay >= 1 && payDay <= 31) {
            this.payDay = payDay;
        } else {
            throw new IllegalArgumentException("Dia de pagamento deve ser entre 1 e 31");
        }
    }

    public void addEmployee(Employee employee) {
        if (employee != null && !employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double payroll() {
        double totalPayroll = 0.0;
        for (Employee employee : employees) {
            totalPayroll += employee.getSalary();
        }
        return totalPayroll;
    }


}
