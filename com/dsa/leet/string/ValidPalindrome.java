package com.dsa.leet.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isValidPalindrome(s));
    }

    private static Boolean isValidPalindrome(String value) {
        String cleanString = value.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (cleanString == "" ){
            return true;
        }
        for(int i=0; i<cleanString.length(); i++){
            if(cleanString.charAt(i) != cleanString.charAt(cleanString.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
