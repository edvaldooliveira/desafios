package com.desafios.desafioimposto.application;

import com.desafios.desafioimposto.entities.CalcImposto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalcImposto calcImposto = new CalcImposto();


        System.out.print("Renda anual com salário: ");
        double salario = sc.nextDouble();

        //System.out.println(calcImposto.impostoSalario(salario));
       // System.out.println(calcImposto.impostoServicos(salario));
        System.out.println(calcImposto.impostoCapital(salario));

    }
}
