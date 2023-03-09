package com.dsa.leet;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {9})));

    }

    static int[] plusOne(int[] digits) {
        for(int i=digits.length -1 ; i>=0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                break;
            }else{
                digits[i] = 0;
            }
        }
        if(digits[0] == 0){
            int[] digits2 = new int[digits.length+ 1];
            digits2[0] = 1;
            return digits2;
        }
        return digits;
    }
}
