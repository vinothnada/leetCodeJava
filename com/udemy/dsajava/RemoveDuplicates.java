package com.udemy.dsajava;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] input = {12,14,5,6,88,2,3,44,44,3,66,9,7,7};
        System.out.println(Arrays.toString(rmDuplicates(input)));
    }

    public static int[] rmDuplicates(int[] arr){
            int[] uniqueArray = new int[arr.length];
            int count = 0;

            for(int i=0; i< arr.length; i++){
                boolean isDuplicate = false;
                for(int j=0; j < uniqueArray.length ; j++){
                    if(arr[i] == uniqueArray[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if(!isDuplicate){
                    uniqueArray[count] = arr[i];
                    count++;
                }
            }
            return Arrays.copyOf(uniqueArray , count);
    }
}
