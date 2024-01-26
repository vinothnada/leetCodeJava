package com.dsa.leet.string;

public class CalculateLength {
    public static void main(String[] args) {
        String x1 = "abcd";
        char a1[] = x1.toCharArray();

        int count = 0;

        for(char c : a1){
            count ++;
        }

        System.out.println(count);
    }
}
