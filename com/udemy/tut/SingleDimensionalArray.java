package com.udemy.tut;

public class SingleDimensionalArray {
    int arr[] = null;

    public SingleDimensionalArray(int sizeOfArray) {
        this.arr = new int[sizeOfArray];
        for(int i=0; i<sizeOfArray; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }


}
