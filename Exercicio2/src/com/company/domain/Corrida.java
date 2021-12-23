package com.company.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private Integer distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private Integer quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos = new ArrayList<>();

    private SocorristaCarro socorristaCarro = new SocorristaCarro();
    private SocorristaMoto socorristaMoto = new SocorristaMoto();

    public Corrida(){

    }

    public Corrida(Integer distancia, BigDecimal premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public BigDecimal getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(BigDecimal premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(Integer quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void registrarCarro(Carros carros) {
        listaVeiculos.add(carros);
    }

    public void registrarMoto(Moto motos){
        listaVeiculos.add(motos);
    }

    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        listaVeiculos.removeIf(x -> x.getPlaca().equals(placa));
    }

    public void list(List<Veiculo> veiculos) {
        for(Veiculo v : veiculos) {
            System.out.println(v.toString());
        }
    }

    public Veiculo vencedorCorrida(Corrida corrida) {
        List<Veiculo> listaVeiculos = corrida.listaVeiculos;
        Integer velocidade = 0;
        Veiculo veiculoGanhador = null;

        for (Veiculo v : corrida.getListaVeiculos()) {
            Integer ganhador;
            ganhador = v.getVelocidade() * v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100));
            if (ganhador > velocidade) {
                velocidade = ganhador;
                veiculoGanhador = v;
            }
        }
        return veiculoGanhador;
    }

    public void socorrerCarro(Carros carro) {
        socorristaCarro.socorrer(carro);
        removerVeiculo(carro);
    }

    public void socorrerMoto(Moto moto) {
        socorristaMoto.socorrer(moto);
        removerVeiculo(moto);
    }

}
