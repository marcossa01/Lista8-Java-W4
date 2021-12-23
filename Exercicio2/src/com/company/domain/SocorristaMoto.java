package com.company.domain;

public class SocorristaMoto {

    public void socorrer(Moto moto) {
        System.out.println("Socorrendo Moto -> Patente: " + moto.getPatente() + ", Placa: " + moto.getPlaca());
    }
}
