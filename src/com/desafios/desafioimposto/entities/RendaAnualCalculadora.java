package com.desafios.desafioimposto.entities;

public class RendaAnualCalculadora {

    private double rendaAnualSalario;
    private double impostoServico;
    private double impostoCapital;

    public RendaAnualCalculadora() {
    }
    public RendaAnualCalculadora(double rendaAnualSalario, double impostoServico, double impostoCapital) {
        this.rendaAnualSalario = rendaAnualSalario;
        this.impostoServico = impostoServico;
        this.impostoCapital = impostoCapital;
    }

    public double getRendaAnualSalario() {
        return rendaAnualSalario;
    }
    public void setRendaAnualSalario(double rendaAnualSalario) {
        this.rendaAnualSalario = rendaAnualSalario;
    }
    public double getImpostoServico() {
        return impostoServico;
    }
    public void setImpostoServico(double impostoServico) {
        this.impostoServico = impostoServico;
    }
    public double getImpostoCapital() {
        return impostoCapital;
    }
    public void setImpostoCapital(double impostoCapital) {
        this.impostoCapital = impostoCapital;
    }
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




