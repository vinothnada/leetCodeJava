package com.dsa.leet;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {5,2,2,3,3}));
    }

    static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> nums_arr = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums_arr.containsKey(nums[i])){
                int val = nums_arr.get(nums[i]);
                nums_arr.put(nums[i], val+1);
            }else{
                nums_arr.put(nums[i],1);
            }
        }

        System.out.println(nums_arr);

        for(int j=1; j <= nums_arr.size(); j++){
            int val2 = nums_arr.get(j);
            if(val2 > 1){
               continue;
            }else{
                return j;
            }
        }
        throw new IllegalArgumentException("Value not found");
    }
}
