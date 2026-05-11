package service;

import model.Produto;

public class BuscaSequencial {

    public static Produto buscaSequencial(Produto[] lista, int id) {

        for(Produto p : lista) {

            if(p.id == id) {
                return p;
            }
        }

        return null;
    }
}
