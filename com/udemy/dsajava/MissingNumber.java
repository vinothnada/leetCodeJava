package com.udemy.dsajava;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,7,8,9};
        System.out.println(findMissingNumberInArray(numbers));

    }

    static int findMissingNumberInArray(int[] arr) {
        int arrSize = arr[arr.length-1];
        int sumOfTotal = arrSize * (arrSize+1) /2;

        int actualSize = 0;
        for(int item : arr){
            actualSize += item;
        }
        return sumOfTotal - actualSize;
    }
}
