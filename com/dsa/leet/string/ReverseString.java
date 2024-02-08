package com.dsa.leet.string;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        reverseString(new char[] {'h','e','l','l','o'});
    }

    public static void reverseString(char[] s) {
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

//        char temp;
//        for(int i=0; i<s.length/2; i++){
//            temp = s[i];
//            s[i] = s[s.length -1 -i];
//            s[s.length -1 -i]= temp;
//        }
//        System.out.println(Arrays.toString(s));
    }
}
