import java.util.Scanner;

import model.Produto;
import service.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProdutoService service = new ProdutoService();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== MENU DO SISTEMA =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Ordenar (Bubble Sort)");
            System.out.println("4 - Ordenar (Selection Sort)");
            System.out.println("5 - Buscar (Sequencial)");
            System.out.println("6 - Buscar (Binária)");
            System.out.println("7 - Buscar (Hash)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {

                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {

                    case 1:

                        System.out.print("Digite o ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite o preço: ");
                        double preco = Double.parseDouble(scanner.nextLine());

                        Produto produto = new Produto(id, nome, preco);

                        service.adicionarProduto(produto);

                        System.out.println("Produto cadastrado com sucesso!");
                        break;

                    case 2:

                        System.out.println("\n=== LISTA DE PRODUTOS ===");
                        service.listarProdutos();
                        break;

                    case 3:

                        Produto[] listaBubble = service.obterArray();

                        BubbleSortService.bubbleSort(listaBubble);

                        System.out.println("Produtos ordenados por ID usando Bubble Sort.");

                        for (Produto p : listaBubble) {
                            System.out.println(p);
                        }

                        break;

                    case 4:

                        Produto[] listaSelection = service.obterArray();

                        SelectionSort.selectionSort(listaSelection);

                        System.out.println("Produtos ordenados por nome usando Selection Sort.");

                        for (Produto p : listaSelection) {
                            System.out.println(p);
                        }

                        break;

                    case 5:

                        System.out.print("Digite o ID para busca sequencial: ");
                        int idSeq = Integer.parseInt(scanner.nextLine());

                        Produto resultadoSeq =
                                BuscaSequencial.buscaSequencial(
                                        service.obterArray(),
                                        idSeq
                                );

                        if (resultadoSeq != null) {
                            System.out.println("Produto encontrado:");
                            System.out.println(resultadoSeq);
                        } else {
                            System.out.println("Produto não encontrado.");
                        }

                        break;

                    case 6:

                        Produto[] listaBinaria = service.obterArray();

                        BubbleSortService.bubbleSort(listaBinaria);

                        System.out.print("Digite o ID para busca binária: ");
                        int idBin = Integer.parseInt(scanner.nextLine());

                        Produto resultadoBin =
                                BuscaBinaria.buscaBinaria(
                                        listaBinaria,
                                        idBin
                                );

                        if (resultadoBin != null) {
                            System.out.println("Produto encontrado:");
                            System.out.println(resultadoBin);
                        } else {
                            System.out.println("Produto não encontrado.");
                        }

                        break;

                    case 7:

                        System.out.print("Digite o ID para busca hash: ");
                        int idHash = Integer.parseInt(scanner.nextLine());

                        Produto resultadoHash =
                                service.getTabelaHash().buscar(idHash);

                        if (resultadoHash != null) {
                            System.out.println("Produto encontrado:");
                            System.out.println(resultadoHash);
                        } else {
                            System.out.println("Produto não encontrado.");
                        }

                        break;

                    case 0:

                        System.out.println("Sistema encerrado.");
                        break;

                    default:

                        System.out.println("Opção inválida.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Digite um valor numérico válido.");

            } catch (Exception e) {

                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
