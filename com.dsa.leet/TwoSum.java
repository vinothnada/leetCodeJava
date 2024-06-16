package com.dsa.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1
public class TwoSum {

    public static void main(String[] args) {
        int [] result = twoSum(new int[] {5,4,3} , 9);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target){
        Map<Integer , Integer> map1 = new HashMap<>();
        int[] result = new int[2];
        for(int i=0 ; i<nums.length; i++){
            if(map1.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = map1.get(target - nums[i]);
                return result;
            }
            map1.put(nums[i] , i);
        }
        return result;
    }

}

