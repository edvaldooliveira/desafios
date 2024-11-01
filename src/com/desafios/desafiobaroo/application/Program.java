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

        System.out.println(bill.getBarbecue());
       int resulBeer = bill.getBeer() * 5;
       int resulBarbecue = bill.getBarbecue() * 7;
       double consumo = resulBeer + resulBarbecue;


        System.out.println("\nRELATÓRIO: ");
        System.out.printf("Consumo = %.2f", consumo);

        sc.close();

    }
}
