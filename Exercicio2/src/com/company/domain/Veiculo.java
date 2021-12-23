package com.company.domain;

public class Veiculo {
    private Integer velocidade;
    private Integer aceleracao;
    private Integer anguloDeGiro;
    private String placa;
    private Integer peso;
    private Integer rodas;
    private String patente;

    public Veiculo(){

    }

    public Veiculo(Integer velocidade, Integer aceleracao, Integer anguloDeGiro, String placa, String patente) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.patente = patente;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(Integer aceleracao) {
        this.aceleracao = aceleracao;
    }

    public Integer getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(Integer anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getRodas() {
        return rodas;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Veiculo: " + patente + ", Placa: " + placa;
    }
}
