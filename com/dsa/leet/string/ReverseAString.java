package com.dsa.leet.string;

public class ReverseAString {

    public static void main(String[] args) {
        String s = "abcdefghijkmnopqrstuvwxyz";

        char c1[] = s.toCharArray();
        char c2[] = new char[c1.length];

        int count = 0;

        for(char letter : c1){
            c2[count] = c1[c1.length -1 -  count];
            count ++;
        }

        System.out.println(c2);
    }
}
