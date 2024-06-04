package com.udemy.dsajava;

import java.util.Arrays;

public class RemoveDuplicatesLeetCode {
    public static void main(String[] args) {
        int [] input = {1,1,2,3,3,4,4,5,6,6,6,6,7,8,8,9};
        System.out.println(remDuplicates(input));
    }

    private static int remDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }
}
