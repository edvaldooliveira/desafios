package com.desafios.desafioimposto.application;

import com.desafios.desafioimposto.entities.CalcImposto;
import com.desafios.desafioimposto.entities.CalcSalario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalcImposto calcImposto = new CalcImposto();
        CalcSalario calcSalario = new CalcSalario();


        System.out.print("Renda anual com salário: ");
        double salario = sc.nextDouble();

        //System.out.println(calcImposto.impostoSalario(salario));
       // System.out.println(calcImposto.impostoServicos(salario));
        //System.out.println(calcImposto.impostoCapital(salario));
       double reslt = calcSalario.calcularImposto(salario);
        System.out.println(reslt);

    }
}
