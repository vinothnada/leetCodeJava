package com.udemy.dsajava;

import java.util.Arrays;

public class Middle {
    public static void main(String[] args) {
        int[] arr1 =  {3,4,7,2,4,5,6,7};
        System.out.println(Arrays.toString(middleFunction(arr1)));
    }

    public static int[] middleFunction(int[] array){
        int[] arr2 = new int[array.length -2 ];
        for (int i=1; i< array.length-1; i++){
            arr2[i-1] = array[i];
        }
        return arr2;
    }
}
