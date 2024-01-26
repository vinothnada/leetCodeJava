package com.dsa.leet.string;

public class CopyString {

    public static void main(String[] args) {
        String x1 = "Data Abcd";
        char a1[] = x1.toCharArray();
        char a2[] = new char[a1.length];

        int count = 0;
        for(char c:a1){
            a2[count] = a1[count];
            count++;
        }
        System.out.println(a2);
    }


}
