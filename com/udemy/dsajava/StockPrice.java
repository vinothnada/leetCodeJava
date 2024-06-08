package com.udemy.dsajava;

public class StockPrice {
    public static void main(String[] args) {
        int[] arra1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arra1));
    }

    private static int maxProfit(int[] arr) {
        int profit = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                if(arr[j] - arr[i] > profit){
                    profit = arr[j] - arr[i];
                }
            }
        }
        return profit;
    }


}
