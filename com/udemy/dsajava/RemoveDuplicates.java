package com.udemy.dsajava;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] input = {12,14,5,6,88,2,3,44,44,3,66,9,7,7};
        System.out.println(Arrays.toString(rmDuplicates(input)));
    }

    public static int[] rmDuplicates(int[] arr){
        int[] newArray = new int[arr.length];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            boolean isDup = false;
            for(int j=0; j< newArray.length; j++){
                if(arr[i] == newArray[j]){
                    isDup = true;
                    break;
                }
            }
            if(!isDup){
                newArray[index++] = arr[i];
            }
        }
        return Arrays.copyOf(newArray , index);
    }

}
