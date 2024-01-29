package com.dsa.leet.string;

public class IndexOfFistOcc28 {
    public static void main(String[] args) {

        String haystack  = "sabutsad";
        String needle = "sad";

        System.out.println(calculate(haystack,needle));
    }

    public static int calculate(String haystack, String needle) {
        for(int i=0; i<haystack.length() - needle.length() + 1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int lengthToCheck = i + needle.length();
                String word = haystack.substring(i, lengthToCheck );
                if(word.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
