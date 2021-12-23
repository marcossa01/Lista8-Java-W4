package com.company;

import com.company.domain.GuardaRoupa;
import com.company.domain.Vestuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        SaveTheRopa S.A
         */

        List<Vestuario> list1 = new ArrayList<>();
        List<Vestuario> list2 = new ArrayList<>();

        Vestuario v1 = new Vestuario("Nike", "Tenis Air max");
        Vestuario v2 = new Vestuario("Nike", "Chuteira Mercurial");
        Vestuario v3 = new Vestuario("Nike", "Tenis Air max 90");
        Vestuario v4 = new Vestuario("Adidas", "Chuteira adidas Predator");

        Vestuario v5 = new Vestuario("Polo", "Camisa Social");
        Vestuario v6 = new Vestuario("Reserva", "Camisa Basica");
        Vestuario v7 = new Vestuario("Reserva", "Camisa Basica azul");
        Vestuario v8 = new Vestuario("Adidas", "Camisa sport");

        list1.addAll(Arrays.asList(v1, v2, v3, v4));
        list2.addAll(Arrays.asList(v5, v6, v7, v8));

        GuardaRoupa guardaRoupa = new GuardaRoupa();

        guardaRoupa.guardarVestuario(list1);
        guardaRoupa.guardarVestuario(list2);

        guardaRoupa.mostrarVestuario();

        System.out.println();

        guardaRoupa.devolverVestuário(1);
        guardaRoupa.mostrarVestuario();
    }
}
