package com.dsa.leet.string;

import static java.lang.Integer.parseInt;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(12354));
    }

    public static int reverse(int x) {
        int y = x>0 ? x : x * -1;
        int lastDifit = 0;
        int reverse = 0;
        while(y > 0){
            lastDifit = y % 10;
            reverse = reverse * 10;
            reverse= reverse + lastDifit;
            y = y/10;
        }

        if(x<0){
            return -1 * reverse;
        }
        return reverse;
    }
}
