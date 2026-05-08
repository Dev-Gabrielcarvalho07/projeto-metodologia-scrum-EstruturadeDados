package br.com.projeto.equipe6;

import br.com.projeto.model.Produto;

public class Mockup {

    // --- MÉTODOS MOCK PARA AS OUTRAS EQUIPES ---

    public static Produto buscaSequencial(Produto[] lista, int id) {
        System.out.println(">> [MOCK] Busca Sequencial acionada para o ID: " + id);
        return null;
    }

    // Mocks para a Equipe 3 (Busca Binária)
    public static Produto buscaBinaria(Produto[] lista, int id) {
        System.out.println(">> [MOCK] Busca Binária acionada para o ID: " + id);
        return null;
    }

    // Mocks para a Equipe 4 (Bubble Sort)
    public static void bubbleSort(Produto[] lista) {
        System.out.println(">> [MOCK] Bubble Sort acionado na lista.");
    }

    // Mocks para a Equipe 5 (Selection Sort)
    public static void selectionSort(Produto[] lista) {
        System.out.println(">> [MOCK] Selection Sort acionado na lista.");
    }

    // Mocks para a Equipe 1 (Modelo e Repositório)
    public static void adicionarProduto(Produto p) {
        System.out.println(">> [MOCK] 'adicionarProduto()' acionado pela Equipe 1.");
    }

    public static void listarProdutos() {
        System.out.println(">> [MOCK] 'listarProdutos()' acionado pela Equipe 1.");
    }
}
