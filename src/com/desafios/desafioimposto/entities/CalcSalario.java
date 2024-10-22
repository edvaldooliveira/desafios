package com.desafios.desafioimposto.entities;

public class CalcSalario {

    // Função para calcular o imposto com base no salário
    public static double calcularImposto(double salario) {
        if (salario < 3000) {
            return 0.0;  // Isento
        } else if (salario >= 3000 && salario < 5000) {
            return salario * 0.10;  // 10% de imposto
        } else {
            return salario * 0.20;  // 20% de imposto
        }
    }
}
