package main.src.java.cardoso.sorting.Algorythms;

import main.src.java.cardoso.sorting.Useful.AppendArray;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Quicksort {
    public static int [] recursivo(int []unordered_array){
        int[] ordered_array = {};
        int pivot_pos = unordered_array.length;
        pivot_pos--;
        int pivot = unordered_array[pivot_pos];
        if (pivot_pos != 0){
            int []lesserThan = {};
            int []equalTo = {};
            int []greaterThan = {};
            for (int i = 0; i < unordered_array.length; i++){
                if (unordered_array[i] < pivot){
                    lesserThan = AppendArray.appendIntToArray(lesserThan, unordered_array[i]);
                }
                if (unordered_array[i] == pivot){
                    equalTo = AppendArray.appendIntToArray(equalTo, unordered_array[i]);
                }
                if (unordered_array[i] > pivot){
                    greaterThan = AppendArray.appendIntToArray(greaterThan, unordered_array[i]);
                }

            }
            if (lesserThan.length > 1){
                lesserThan = recursivo(lesserThan);
            }
            if (greaterThan.length > 1){
                greaterThan = recursivo(greaterThan);
            }

            ordered_array = AppendArray.appendThreeArrays(lesserThan, equalTo, greaterThan);
        }




        return ordered_array;
    }


}
