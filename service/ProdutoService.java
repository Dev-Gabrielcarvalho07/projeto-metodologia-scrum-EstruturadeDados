package service;

import model.Produto;
import java.util.ArrayList;

public class ProdutoService {

    private ArrayList<Produto> listaProdutos;
    private TabelaHash tabelaHash;

    public ProdutoService() {
        listaProdutos = new ArrayList<>();
        tabelaHash = new TabelaHash(10);
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
        tabelaHash.inserir(produto);
    }

    public void listarProdutos() {

        if(listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for(Produto p : listaProdutos) {
            System.out.println(p);
        }
    }

    public Produto[] obterArray() {
        return listaProdutos.toArray(new Produto[0]);
    }

    public TabelaHash getTabelaHash() {
        return tabelaHash;
    }
}
