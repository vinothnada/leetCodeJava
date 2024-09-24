package com.leetnew.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 18;
        System.out.println(Arrays.toString(findTwoSum(nums , target)));
    }

    static int[] findTwoSum(int [] nums , int target){
        Map<Integer , Integer> map1 = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map1.containsKey(target - nums[i])){
                return new int[] {map1.get(target - nums[i]), i};
            }
            map1.put(nums[i], i) ;
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
