package br.com.projeto;

import br.com.projeto.model.Produto;
import br.com.projeto.service.BuscaSequencial;

public class Main {
    public static void main(String[] args) {
        Produto[] lista = {
            new Produto(1, "Mouse", 50.0),
            new Produto(2, "Teclado", 150.0),
            new Produto(3, "Monitor", 900.0)
        };

        Produto r1 = BuscaSequencial.buscaSequencial(lista, 2);
        System.out.println(r1 != null ? "OK: " + r1 : "ERRO: não encontrou ID 2");

        Produto r2 = BuscaSequencial.buscaSequencial(lista, 99);
        System.out.println(r2 == null ? "OK: ID 99 não existe" : "ERRO: achou algo inválido");

        Produto r3 = BuscaSequencial.buscaSequencialPorNome(lista, "monitor");
        System.out.println(r3 != null ? "OK: " + r3 : "ERRO: não encontrou por nome");
    }
}
