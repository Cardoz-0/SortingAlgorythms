package main.src.java.cardoso.sorting.Useful;

import java.util.Arrays;

public class AppendArray {
    public static int[] appendIntToArray(int [] arr, int element){
//        System.out.println(Arrays.toString(arr));
        int len = arr.length;
        int[] newArray = new int[len + 1];
        for(int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        };
        newArray[len] = element;
//        System.out.println(Arrays.toString(newArray));
//        System.out.println("\n");
        return newArray;
    }

    //REESCREVER DE FORMA RECURSIVA
    public static int[] appendThreeArrays(int [] arr1, int [] arr2, int [] arr3){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3 = arr3.length;
        int[] newArray = new int[len1 + len2 + len3];
        for(int i = 0; i < newArray.length; i++) {
            if (i < len1){
                newArray[i] = arr1[i];
            }
            if ((len1 <= i) && (i < (len2 + len1))){
                newArray[i] = arr2[(i- len1)];
            }
            if (((len2+ len1) <= i) && (i < (len1 + len2 + len3))){
                newArray[i] = arr3[i - len1- len2];
            }
            newArray[i] = newArray[i];
        };
        return newArray;
    }
}
