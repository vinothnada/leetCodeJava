package com.dsa.leet.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrefixCommon {

    public static void main(String[] args) {
        String strs[] = {"cluster","clue","clutch","club","clumsy"};
        String temp = "";

        for(int i=0; i<strs.length; i++){
            for(int j=i+1; j<strs.length; j++){
                if(strs[i].compareTo(strs[j]) > 0){
                    temp = strs[i];
                    strs[i]  = strs[j];
                    strs[j] = temp;
                }
            }
        }

        String first = strs[0];
        String last = strs[strs.length - 1];
        String prefix = "";

        for(int i=0; i< first.length(); i++ ){
            if( first.charAt(i) == last.charAt(i)){
                prefix += String.valueOf(first.charAt(i));
            }else{
                break;
            }
        }
    }
}
