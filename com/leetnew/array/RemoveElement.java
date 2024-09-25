package com.leetnew.array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

    private static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == val ){
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    
}
