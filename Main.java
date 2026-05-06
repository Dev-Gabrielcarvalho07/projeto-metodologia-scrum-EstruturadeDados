

import br.com.projeto.model.Produto;
import br.com.projeto.service.selectionSort;
import br.com.projeto.EQUIPE_5_SELECTION_SORT.Mockup_SelectionSort;

public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mockup_SelectionSort mock = new Mockup_SelectionSort();
        Produto[] estoque = mock.getEstoque();

        selectionSort ordenador = new selectionSort();

        System.out.println("--- ANTES DA ORDENAÇÃO ---");
        for(Produto p : estoque) System.out.println(p.nome);

        ordenador.selectionSort(estoque);

        System.out.println("\n--- DEPOIS DO SELECTION SORT (A-Z) ---");
        for(Produto p : estoque) System.out.println(p.nome);
    }
    
}
