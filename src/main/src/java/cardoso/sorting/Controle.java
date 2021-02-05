package main.src.java.cardoso.sorting;

import main.src.java.cardoso.sorting.Algorythms.Quicksort;
import main.src.java.cardoso.sorting.Useful.AppendArray;
import main.src.java.cardoso.sorting.Useful.UserInput;

import java.util.Arrays;
import java.util.Scanner;

import static main.src.java.cardoso.sorting.Useful.AppendArray.appendThreeArrays;

public class Controle {
    public static void main(String [] args) {
        System.out.println("Escreva o parametro que quer utilizar para separar os elementos(split), como espaço, virgula, traço (mas não utilize aspas)");
        String split = UserInput.scanner();
        System.out.println("Insira os elementos da lista que quer organizar de acordo com seu parametro");

//        int[] unordered = {2, 1, 3, 9, 7, 5, 6, 10, 4};
//        System.out.println(Arrays.toString(Quicksort.recursivo(unordered)));
        String entrada = UserInput.scanner();
        int[] entrada_array = {};
        for (String elemento: entrada.split(split)){
            int i = Integer.parseInt(elemento);
            entrada_array = AppendArray.appendIntToArray(entrada_array, i);
        }
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(Quicksort.recursivo(entrada_array)));
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Tempo de processamento em milisegundos:");
        System.out.println(timeElapsed);
    }

}
