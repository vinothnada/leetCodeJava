package com.udemy.tut;

import java.util.Arrays;

public class MiddleFunctionArray {
    public static void main(String[] args) {
        int[] arr1 =  {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(middle(arr1)));
    }

    public static int[] middle(int[] array) {
        int[] array2 = new int[array.length - 2];
        int j = 0;

        for(int i=1; i < array.length - 1; i++){
            array2[j] = array[i];
            j++;
        }
        return array2;
    }
}
