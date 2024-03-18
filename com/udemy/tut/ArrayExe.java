package com.udemy.tut;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExe {


    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("How many days' temperatures?");
        int numDays= console.nextInt();
        int[] tempArr = new int[numDays];
        int sum = 0;

        for (int i=0; i< numDays; i++){
            System.out.println("Insert Day "+ (i + 1) + " temperature");
            tempArr[i] = console.nextInt();
            sum += console.nextInt();
        }

        for (int i=0; i< numDays; i++){
            System.out.println("Insert Day "+ (i + 1) + " temperature");
            tempArr[i] = console.nextInt();
        }



//        System.out.println("Average temperature is: "+  );



    }
}