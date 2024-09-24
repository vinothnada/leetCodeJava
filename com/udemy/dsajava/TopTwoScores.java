package com.udemy.dsajava;

import java.util.Arrays;

public class TopTwoScores {
    public static void main(String[] args) {
        int [] arr1 = {5,12,3,2,17,3,4,5,6,7,7,8,9};
        System.out.println(Arrays.toString(findTopTwoScores(arr1)));
    }

    public static int[] findTopTwoScores(int[] arr) {
        int firstHighScore = Integer.MIN_VALUE;
        int secondHighScore = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
           if(arr[i] > firstHighScore){
               secondHighScore = firstHighScore;
               firstHighScore = arr[i];
           }else if(arr[i] >secondHighScore && arr[i] < firstHighScore){
               secondHighScore = arr[i];
           }
        }
        return new int[]{firstHighScore,secondHighScore};
    }
}


public static void main(String[] args) {
    int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            int tmp = 0;
            if (arr[i] > arr[j]) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
}