package com.company.domain;

public class SocorristaCarro {

    public void socorrer(Carros carro) {
        System.out.println("Socorrendo Carro -> Patente: " + carro.getPatente() + ", Placa: " + carro.getPlaca());
    }
}
