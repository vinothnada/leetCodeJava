package com.dsa.leet;

import java.util.Arrays;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1001));
    }

    static int reverse(int x) {
        if(x> -10 && x < 10){
            return x;
        }else{
            boolean positive = true;
            if(x<0){
                positive = false;
                x = x * -1;
            }
            String value = Integer.toString(x);
            char[] arr1 = value.toCharArray();
            char[] arr2 = new char[arr1.length];
            for(int i = 0; i < arr1.length; i++){
                arr2[i] = arr1[arr1.length -1 - i];
            }
            String ans = Arrays.toString(arr2);
            System.out.println(ans);
            if(positive){
                return Integer.parseInt(ans);
            }else{
                return Integer.parseInt(ans) * -1;
            }
        }
    }


}
