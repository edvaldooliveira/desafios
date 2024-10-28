package com.desafios.desafioimposto.entities;

public class RendaAnualCalculadora {

    public double impostoSalario(double rendaAnualSalario) {
        double rendaMensal = rendaAnualSalario / 12;
        if (rendaMensal < 3000) {
            return 0.0;
        } else if (rendaMensal < 5000) {
            return rendaAnualSalario * 0.1;
        } else {
            return rendaAnualSalario * 0.2;
        }
    }

    public double impostoServico(double rendaAnualServico) {
        return rendaAnualServico * 0.15;
    }

    public double impostoCapital(double rendaAnualCapital) {
        return rendaAnualCapital * 0.2;
    }
}
