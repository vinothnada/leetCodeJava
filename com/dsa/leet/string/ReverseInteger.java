package com.dsa.leet.string;

import static java.lang.Integer.parseInt;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-12354));
    }

    public static int reverse(int x) {
        StringBuilder st = new StringBuilder();
        int intLength = String.valueOf(x).length();

        int i = 0;
        while (i < intLength){
            char c = String.valueOf(x).charAt(intLength -1- i);
            System.out.println(c);
            if(c != '-'){
                st.append(c);
            }
            i++;
        }
        if(x < 0){
            return  ~x + 1 + parseInt(st.toString());
        }
        return  parseInt(st.toString());
    }
}
