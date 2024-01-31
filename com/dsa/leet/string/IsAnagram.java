package com.dsa.leet.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagramSimple("car", "rac"));
    }

    private static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        StringBuilder st = new StringBuilder();
        st.append(s);

        for(int i=0; i<t.length(); i++){
            int ii = st.indexOf(String.valueOf(t.charAt(i)));
            if((ii) >= 0 ){
                st.deleteCharAt(ii);
            }
        }
        if(st.toString().length() != 0 ){
            return false;
        }
        return true;
    }

    private static boolean isAnagramSimple(String s, String t) {
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}
