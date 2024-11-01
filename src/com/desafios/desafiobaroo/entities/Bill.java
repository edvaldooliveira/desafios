package com.desafios.desafiobaroo.entities;

public class Bill {

    private char gender;
    private int beer;
    private int barbecue;
    private int sofDrink;


    public Bill() {
    }

    public Bill(char gender, int beer, int barbecue, int sofDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.sofDrink = sofDrink;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public int getSofDrink() {
        return sofDrink;
    }

    public void setSofDrink(int sofDrink) {
        this.sofDrink = sofDrink;
    }



    public double cover(double consumo) {
        if (consumo <= 30) {
            return 4.00;
        } else {
            return 0.0;
        }

    }


    public double feeding() {
        return 0;
    }

    public double tichet(double tichet) {
        if (gender == 'M') {
            return 10.0;
        } else {
            return 8.0;
        }
    }

    public double total() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "gender=" + gender +
                ", beer=" + beer +
                ", barbecue=" + barbecue +
                ", sofDrink=" + sofDrink +
                '}';
    }
}
