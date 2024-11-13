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

        System.out.print("Dia de pagamento: ");
        int payDay = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String phone = sc.nextLine();


        // Cria Adress
        Address address = new Address(email, phone);

        // Cria o departamento
        Department department = new Department(deptName, payDay);

        System.out.print("Quantos funcionários você deseja adicionar? ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        // Adiciona empregados ao departamento
        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Dados do funcionário " + i + ":");
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha

            // Cria o empregado e adiciona ao departamento
            Employee employee = new Employee(name, salary);
            department.addEmployee(employee);
        }

        // Exibe informações do departamento e folha de pagamento
        System.out.println();
        System.out.println("RELATÓRIO DO DEPARTAMENTO:");
        System.out.printf("Departamento Vendas = R$ %.2f%n ", department.payroll());
        System.out.println("Pagamento realizado no dia " + department.getPayDay());
        System.out.println("Funcionários: ");
       //Ajustando o relatário


        System.out.printf("Para dúvidas favor entrar em contato: " + address.getEmail());

        sc.close();
    }
}