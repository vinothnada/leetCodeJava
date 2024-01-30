package com.dsa.leet.string;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));

    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hmap1 = new HashMap();
        HashMap<Character,Character> hmap2 = new HashMap();

        for(int i = 0; i < s.length(); i++){
            if(hmap1.containsKey(s.charAt(i))){
                if(hmap1.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }

            if(hmap2.containsKey(t.charAt(i))){
                if(hmap2.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }

            hmap1.put(s.charAt(i) , t.charAt(i));
            hmap2.put(t.charAt(i) , s.charAt(i));
        }
        return true;

    }
}
