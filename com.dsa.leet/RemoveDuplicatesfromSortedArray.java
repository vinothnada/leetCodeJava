package com.dsa.leet;

import java.util.HashMap;

//26
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2}));
    }

    static int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> nums_arr= new HashMap<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(!nums_arr.containsKey(nums[i])){
                nums_arr.put(nums[i],i);
                count ++;
            }
        }
        return count;
    }
}
