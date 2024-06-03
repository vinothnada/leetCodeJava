package com.udemy.dsajava;

import java.lang.reflect.Array;

public class SumDiagonalElements {
    public static void main(String[] args) {
        int[][] myArr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumofdia(myArr));
    }

    public static int sumofdia(int[][] arr1){
        int sum = 0;
        for(int i=0; i < arr1.length; i++){
            sum += arr1[i][i];
        }
        return sum;
    }
}
