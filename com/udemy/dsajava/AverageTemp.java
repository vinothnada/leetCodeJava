package com.udemy.dsajava;

import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many days temperatures ?");
        int numDays = console.nextInt();

        int[] temps = new int[numDays];
        int sumOfTemps = 0;
        int daysAboveAverage = 0;

        for(int i=1; i<= numDays; i++){
            System.out.println("Enter Day:" + i + " temperature" );
            int t = console.nextInt();
            temps[i-1] = t;
            sumOfTemps += t;
        }

        double averageTemperature =  (double) sumOfTemps / numDays;
        System.out.println("Average temperature is :" + averageTemperature );

        for (int temp : temps) {
            if(temp > averageTemperature){
                daysAboveAverage++;
            }
        }
        System.out.println("Above Average days :" + daysAboveAverage );
    }
}
