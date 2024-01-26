package com.dsa.leet.string;

import java.util.ArrayList;
import java.util.List;

public class PrefixCommon {

    public static void main(String[] args) {
        String strs[] = {"ab","a"};

        String first = strs[0];

        String prefix = "";
        if(strs.length > 1){
            for(int j=0; j< first.length(); j++){
                Boolean isThere = false;
                for(int i=1; i< strs.length; i++){
                    if(j<= i && first.charAt(j) == strs[i].charAt(j)){
                        isThere= true;
                    }else{
                        isThere= false;
                        break;
                    }
                }
                if(isThere){
                    String val = String.valueOf(first.charAt(j));
                    prefix = prefix.concat(val);
                }
            }
        }

        System.out.println("The prefix");
        System.out.println(prefix);


    }
}
