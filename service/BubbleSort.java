package service;

import model.Produto;

public class BubbleSortService {

    public static void bubbleSort(Produto[] lista) {
        int n = lista.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (lista[j].id > lista[j + 1].id) {
                    Produto temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
}
