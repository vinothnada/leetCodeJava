package com.dsa.leet.string;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        //26
        System.out.println(removeDuplicates(new int[] {1,2,3,4,5,6,6,6,7,7,7,8,8,9,9,9}));
    }

    public static int removeDuplicates(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
        return 4;
    }
}
