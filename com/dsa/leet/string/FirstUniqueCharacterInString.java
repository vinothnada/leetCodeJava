package com.dsa.leet.string;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aadvdaad"));
    }

    private static int firstUniqChar(String s) {
        HashMap<Character , Integer > map1= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i) , map1.get(s.charAt(i)) + 1);
            }else{
                map1.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<s.length(); i++){
            if(map1.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
