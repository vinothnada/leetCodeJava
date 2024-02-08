package com.dsa.leet.string;

import java.util.Arrays;

public class reverseStringVowels {
    public static void main(String[] args) {
        rStringVowels(new char[] {'h','e','l','l','o'});
    }

    static void rStringVowels(char[] s) {
        char temp;
        int left = 0;
        int right = s.length;

        while (left < right){
            temp = s[left];
            s[left] = s[s.length -1 -left];
            s[s.length -1 -left]= temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }
}
