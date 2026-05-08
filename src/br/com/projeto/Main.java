package br.com.projeto;

import br.com.projeto.equipe6.Mockup;
import br.com.projeto.model.Produto;
import br.com.projeto.service.TabelaHash;

/*
 * EQUIPE 6 - TABELA HASH
 * 
 * Integrantes:
 * - LUCIO AGUIAR
 * - GUILHERME SILVA
 * - JURANDIR MARQUES
 * - RAMON SILVA
 * - JOAO VICTOR GONÇALVES
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Estruturas de armazenamento
        List<Produto> listaProdutos = new ArrayList<>();
        TabelaHash tabelaHash = new TabelaHash(10); // Tamanho arbitrário para o Hash

        // Menu principal

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== MENU DO SISTEMA ===\n");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Ordenar (Bubble Sort) - (Equipe 4)");
            System.out.println("4 - Ordenar (Selection Sort) - (Equipe 5)");
            System.out.println("5 - Buscar (Sequencial) - (Equipe 2)");
            System.out.println("6 - Buscar (Binária) - (Equipe 3)");
            System.out.println("7 - Buscar (Hash) - (Equipe 6)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida!");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Produto - A ser implementado pela Equipe 1");
                    Mockup.adicionarProduto(null); // Equipe 1
                    break;
                case 2:
                    System.out.println("\n--- Lista de Produtos (Equipe 1) ---");
                    Mockup.listarProdutos(); // Equipe 1
                    break;
                case 3:
                    System.out.println("Ordenação Bubble Sort - A ser implementada pela Equipe 4");
                    Mockup.bubbleSort(listaProdutos.toArray(new Produto[0]));// Equipe 4
                    break;
                case 4:
                    System.out.println("Ordenação Selection Sort - A ser implementada pela Equipe 5");
                    Mockup.selectionSort(listaProdutos.toArray(new Produto[0]));
                    break;
                case 5:
                    System.out.println("Busca Sequencial - A ser implementada pela Equipe 2");
                    System.out.print("Digite o ID para buscar: ");
                    int idSeq = Integer.parseInt(scanner.nextLine());
                    Mockup.buscaSequencial(listaProdutos.toArray(new Produto[0]), idSeq);// Equipe 2
                    break;
                case 6:
                    System.out.println("Busca Binária - A ser implementada pela Equipe 3");
                    System.out.print("Digite o ID para buscar: ");
                    int idBin = Integer.parseInt(scanner.nextLine());
                    Mockup.buscaBinaria(listaProdutos.toArray(new Produto[0]), idBin);
                    break;
                case 7:
                    System.out.println("\n--- Busca Hash (Equipe 6) ---");
                    carregarJsonParaTeste(tabelaHash);
                    System.out.print("Digite o ID para buscar: ");
                    int buscaId = Integer.parseInt(scanner.nextLine());
                    Produto encontrado = tabelaHash.buscar(buscaId);
                    if (encontrado != null) {
                        System.out.println("Produto encontrado: " + encontrado);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    // Leitor nativo do JSON dedicado apenas para o teste da Equipe 6, pode ser
    // apagado ao ser implementado pelo PO
    private static void carregarJsonParaTeste(TabelaHash hash) {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("mockups/produtos.json");
            if (!java.nio.file.Files.exists(path))
                return;
            String json = new String(java.nio.file.Files.readAllBytes(path));

            int startIndex = json.indexOf('{');
            while (startIndex != -1) {
                int endIndex = json.indexOf('}', startIndex);
                if (endIndex == -1)
                    break;
                String block = json.substring(startIndex, endIndex);

                int idIdx = block.indexOf("\"id\"") + 4;
                idIdx = block.indexOf(':', idIdx) + 1;
                int idEnd = block.indexOf(',', idIdx);
                int id = Integer.parseInt(block.substring(idIdx, idEnd).trim());

                int nomeIdx = block.indexOf("\"nome\"") + 6;
                nomeIdx = block.indexOf(':', nomeIdx) + 1;
                int nomeStart = block.indexOf('"', nomeIdx) + 1;
                int nomeEnd = block.indexOf('"', nomeStart);
                String nome = block.substring(nomeStart, nomeEnd);

                int precoIdx = block.indexOf("\"preco\"") + 7;
                precoIdx = block.indexOf(':', precoIdx) + 1;
                int precoEnd = block.indexOf('\n', precoIdx);
                if (precoEnd == -1)
                    precoEnd = block.indexOf('}', precoIdx);
                if (precoEnd == -1)
                    precoEnd = block.length();
                double preco = Double.parseDouble(block.substring(precoIdx, precoEnd).trim());

                hash.inserir(new Produto(id, nome, preco));
                startIndex = json.indexOf('{', endIndex);
            }
            System.out.println(">> (Mockup JSON carregado na Hash para realização do teste)");
        } catch (Exception e) {
            System.out.println(">> (Falha ao ler JSON: " + e.getMessage() + ")");
        }
    }
}
