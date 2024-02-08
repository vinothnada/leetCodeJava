package com.dsa.leet.string;

import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("bg" , "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] crNote = ransomNote.toCharArray();
        char[] cMag = magazine.toCharArray();
        Arrays.sort(crNote);
        Arrays.sort(cMag);
        System.out.println(new String(cMag));
        System.out.println(new String(crNote));
        return new String(cMag).contains(new String(crNote));
    }
}
