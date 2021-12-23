package com.company.domain;

public class Moto extends Veiculo {

    private Integer peso = 300;
    private Integer rodas = 2;

    public Moto(Integer velocidade, Integer aceleracao, Integer anguloDeGiro, String placa, String patente) {
        super(velocidade, aceleracao, anguloDeGiro, placa, patente);
    }

    @Override
    public Integer getPeso() {
        return peso;
    }

    @Override
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public Integer getRodas() {
        return rodas;
    }

    @Override
    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }
}
