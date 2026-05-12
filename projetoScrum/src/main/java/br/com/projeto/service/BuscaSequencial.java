package br.com.projeto.service;

import br.com.projeto.model.Produto;

public class BuscaSequencial {

    public static Produto buscaSequencial(Produto[] lista, int id) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].id == id) {
                return lista[i];
            }
        }
        return null;
    }

    public static Produto buscaSequencialPorNome(Produto[] lista, String nome) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].nome.equalsIgnoreCase(nome)) {
                return lista[i];
            }
        }
        return null;
    }
}
