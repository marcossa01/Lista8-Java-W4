package com.company;

import com.company.domain.Carros;
import com.company.domain.Corrida;
import com.company.domain.Moto;
import com.company.domain.Veiculo;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Carros(180, 30, 10, "JKF-9098", "Mercedez benz");
        Veiculo v2 = new Carros(220, 50, 20, "JKF-9099", "Renault Clio");
        Veiculo v3 = new Carros(160, 60, 30, "JKF-9097", "BMW");
        Veiculo v4 = new Carros(200, 40, 10, "JKF-9094", "Passati Alemão");

        Veiculo v5 = new Moto(150, 30, 12, "KHJ-4587", "Dafra");
        Veiculo v6 = new Moto(180, 50, 19, "KHJ-4584", "Suzuki");
        Veiculo v7 = new Moto(130, 40, 25, "KHJ-4586", "Honda");
        Veiculo v8 = new Moto(170, 20, 60, "KHJ-4583", "Honda 2");


        Corrida corrida1 = new Corrida(100, new BigDecimal(1500.00), "Corrida dos Milhões", 4);

        corrida1.registrarCarro((Carros) v1);
        corrida1.registrarCarro((Carros) v2);
        corrida1.registrarCarro((Carros) v3);
        corrida1.registrarCarro((Carros) v4);

        corrida1.registrarMoto(((Moto) v5));
        corrida1.registrarMoto((Moto) v6);
        corrida1.registrarMoto((Moto) v7);
        corrida1.registrarMoto((Moto) v8);

        corrida1.list(corrida1.getListaVeiculos());
        System.out.println();

        corrida1.removerVeiculoPorPlaca("JKF-9097");
        corrida1.list(corrida1.getListaVeiculos());

        System.out.println();
        corrida1.removerVeiculo(v7);
        corrida1.list(corrida1.getListaVeiculos());

        System.out.println();
        corrida1.socorrerCarro((Carros) v2);
        corrida1.socorrerMoto((Moto) v5);

        System.out.println();
        corrida1.list(corrida1.getListaVeiculos());


        System.out.println();
        System.out.println("Ganhador da " + corrida1.getNome() + ": " + corrida1.vencedorCorrida(corrida1));
        System.out.println("Prêmio do Ganhador: $" + corrida1.getPremioEmDolares() + " Dólares. Parabéns!");

    }
}
