package com.company.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> dicionario = new HashMap<>();
    private Integer contador = 0;

    public GuardaRoupa(){

    }

    public Integer guardarVestuario(List<Vestuario> listaDeVestuario) {
        dicionario.put(contador++, listaDeVestuario);
        return contador;
    }

    public void mostrarVestuario() {
        for (Integer id : dicionario.keySet()) {
            List<Vestuario> list = dicionario.get(id);
            for(Vestuario vestuario : list) {
                System.out.println(vestuario.toString());
            }
        }

    }

    public List<Vestuario> devolverVestuário(Integer id) {
        List<Vestuario> listaVestuario = dicionario.get(id);
        dicionario.remove(id);
        return listaVestuario;
    }



}
