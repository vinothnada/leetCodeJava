package com.udemy.dsajava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums= {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(tooSum(nums, target)));
    }

    private static int[] tooSum(int[] nums, int target) {
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j < nums.length; j++){
                if(nums[i] != nums[j] && target - nums[i] == nums[j]){
                    return new int[]{i , j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
