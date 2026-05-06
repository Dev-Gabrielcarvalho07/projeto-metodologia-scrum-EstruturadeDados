//TESTE FEITO PELA EQUIPE 5 - SERVICE
//CAIO ABREU, CASSIANO ABREU, GABRIEL NAOKI, GUSTAVO DOUTOR, WILLYAN NOGUEIRA

package br.com.projeto.EQUIPE_5_SELECTION_SORT;

import br.com.projeto.model.Produto;
import br.com.projeto.service.selectionSort;

public class Teste_SelectionSort {

        public static void main(String[] args) {
        // Criando uma lista de produtos bagunçada
        Produto[] estoque = {
            new Produto("Teclado", 150.0),
            new Produto("Mouse", 80.0),
            new Produto("Monitor", 900.0),
            new Produto("Cadeira", 1200.0)
        };

        selectionSort ordenador = new selectionSort();
        
        System.out.println("--- ANTES DA ORDENAÇÃO ---");
        for(Produto p : estoque) System.out.println(p.nome);

        // Chama o método que sua equipe ficou responsável
        ordenador.selectionSort(estoque);

        System.out.println("\n--- DEPOIS DO SELECTION SORT (A-Z) ---");
        for(Produto p : estoque) System.out.println(p.nome);
    }
}
