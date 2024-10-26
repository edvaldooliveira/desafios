package com.desafios.desafioimposto.entities;

public class rendaMensal {

    //Calculo do imposto
    public double  impostoSalario(double rendaSalario) {
        return rendaSalario * 0.1;
    }

    public double  impostoServicos(double rendaServicos) {
        return rendaServicos * 0.15;
    }

    public double impostoCapital(double ganhoCapital) {
        return ganhoCapital * 0.2;
    }



    public double GastosDedutiveis(double impostoBrutoTotal) {

        return impostoBrutoTotal * 0.30;
    }




}
