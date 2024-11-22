package com.desafios.desafioempregados.application;


import com.desafios.desafioempregados.entities.Address;
import com.desafios.desafioempregados.entities.Department;
import com.desafios.desafioempregados.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Nome do departamento: ");
        String deptName = sc.nextLine();

        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String phone = sc.nextLine();


        Address address = new Address(email, phone);
        Department department = new Department(deptName, payDay);

        System.out.print("Quantos funcionários tem o departamento? ");
        int numEmployees = sc.nextInt();
        sc.nextLine();


        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Dados do funcionário " + i + ":");
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            sc.nextLine();


            Employee employee = new Employee(name, salary);
            department.addEmployee(employee);
        }


        System.out.println("\nFOLHA DE PAGAMENTO:");
        System.out.printf("Departamento %s = R$ %.2f%n", department.getName(), department.payroll());
        System.out.println("Pagamento realizado no dia " + department.getPayDay());
        System.out.println("Funcionários:");
        for (Employee emp : department.getEmployees()) {
            System.out.println(emp.getName());
        }
        System.out.println("Para dúvidas favor entrar em contato: " + address.getEmail());

        sc.close();
    }
}