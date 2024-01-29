package com.dsa.leet.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "manja poonai";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        System.out.println(s.trim().lastIndexOf(" "));
        System.out.println(s.substring(6,s.trim().length()));
        return s.lastIndexOf(" ") > 0 ? s.trim().substring(s.trim().lastIndexOf(" ") + 1 , s.trim().length()).length() : s.trim().length();
    }
}
