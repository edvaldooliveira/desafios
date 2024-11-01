package com.desafios.desafiobaroo.application;

import com.desafios.desafiobaroo.entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo: ");
        char gender = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        int beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        int sofDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        int barbecue = sc.nextInt();


        Bill bill = new Bill(gender, beer, barbecue, sofDrink);

      double consumo = bill.getBeer() * 5 + bill.getBarbecue() * 7 + bill.getSofDrink() * 3;

      double resulCouvert = bill.cover(consumo);

        System.out.println("\nRELATÓRIO: ");
        System.out.printf("Consumo = R$ %.2f\n", consumo);

        if (resulCouvert > 30) {
            System.out.printf("Couvert = R$ %.2f ", resulCouvert);
        } else {
            System.out.println("Isento de Couvert ");
        }
        System.out.printf("Ingresso = R$ %.2f ", bill.tichet(gender));



        sc.close();

    }
}
