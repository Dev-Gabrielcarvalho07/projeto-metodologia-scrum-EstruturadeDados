package br.com.projeto.service;

import br.com.projeto.model.Produto;

public class selectionSort implements IOrdenacao{

    @Override
    public void selectionSort(Produto[] lista){
    
        for(int i = 0; i < lista.length - 1; i++){
            int indiceMenor = i; // O codigo presume que o primeiro elemento é o "menor"

            for(int j = i + 1; j < lista.length; j++){
                
                if(lista[j].nome.compareToIgnoreCase(lista[indiceMenor].nome) < 0){ // Comparando
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) { // Troca
                Produto temp = lista[i]; // Coloca o produto atual na "mesa" (variável auxiliar)
                lista[i] = lista[indiceMenor]; // Coloca o produto que achamos (o correto da ordem) na frente
                lista[indiceMenor] = temp; // Pega o que estava na mesa e coloca no lugar de onde o outro saiu
            }
        }
    }
}
