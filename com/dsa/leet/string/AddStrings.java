package com.dsa.leet.string;

public class AddStrings {

    public static void main(String[] args) {
        System.out.println(addStrings("12","345"));
    }

    static String addStrings(String num1, String num2) {
        int carry = 0;
        int longestNum = Math.max(num1.length(), num2.length());
        int[] arr = new int[longestNum];

        for(int i = longestNum -1 ; i>=0; i--){
            int res = (int)num1.charAt(i);
        }
        return  "ass";
    }
}
