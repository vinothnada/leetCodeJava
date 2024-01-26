package com.dsa.leet.string;

public class romanString {

    private static int convert(char s){
        switch (s){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        String romanString = "MCMXCIV";
        System.out.println(romanToInteger(romanString));

    }

    public static int romanToInteger(String s){
        int sum = 0;
        int currentElement = convert(s.charAt(0));

        for(int i=1; i<s.length(); i++){
            int nextElement = convert(s.charAt(i));
            if(currentElement < nextElement){
                sum -= currentElement;
            }else{
                sum += currentElement;
            }
            currentElement = nextElement;
        }
        sum += currentElement;
        return sum;
    }
}
