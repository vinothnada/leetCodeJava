package com.dsa.leet.string;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Malayalam";
        String s1 = s.toLowerCase();

        char c1[] = s1.toCharArray();

        Boolean isPalindrome = false;

        int count = 0;
        for(char c : c1){
            if(c1[count] != c1[c1.length - 1 - count]){
                isPalindrome = false;
            }else{
                isPalindrome = true;
            }
            count ++;
        }

        System.out.println(isPalindrome);
    }
}
