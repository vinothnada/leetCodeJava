package com.leetnew.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * RemoveDuplicatesfromSortedArray
 */
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2}));
    }

    static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++ ){
            if(i < nums.length - 1 && nums[i] == nums[i+1]){
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}