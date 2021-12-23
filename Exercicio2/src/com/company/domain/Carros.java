package com.company.domain;

public class Carros extends Veiculo{
    private Integer peso = 1000;
    private Integer rodas = 4;

    public Carros(Integer velocidade, Integer aceleracao, Integer anguloDeGiro, String placa, String patente) {
        super(velocidade, aceleracao, anguloDeGiro, placa, patente);
    }

    @Override
    public Integer getPeso() {
        return peso;
    }

    @Override
    public Integer getRodas() {
        return rodas;
    }

    @Override
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

}
