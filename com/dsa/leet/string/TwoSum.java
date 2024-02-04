package com.dsa.leet.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {
        int [] result = twoSum(new int[] {5,4,3} , 9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        while(i<nums.length){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }else{
                map.put(nums[i],i);
            }
            i++;
        }
        return null;
    }
}
