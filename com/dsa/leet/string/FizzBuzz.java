package com.dsa.leet.string;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }


    public static List<String> fizzBuzz(int n) {
        List<String> ls = new ArrayList<>();
        for(int i=1; i<=n; i++){
            ls.add(i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i));
        }
        return ls;
    }
}
