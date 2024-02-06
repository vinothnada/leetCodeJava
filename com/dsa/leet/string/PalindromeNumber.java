package com.dsa.leet.string;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int x) {
//        String s= String.valueOf(x);
//        for(int i=0; i<s.length();i++){
//            if(s.charAt(i) != s.charAt(s.length() -i -1)){
//                return false;
//            }
//        }
//        return true;
        if(x<0){
            return false;
        }

        int temp = x;
        int lastDifit = 0;
        int reverse = 0;
        while(temp > 0){
            lastDifit = temp % 10;
            reverse = reverse * 10;
            reverse= reverse + lastDifit;
            temp = temp/10;
        }

        if(reverse == x){
            return true;
        }
        return false;
    }
}
