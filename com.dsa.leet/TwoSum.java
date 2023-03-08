package com.dsa.leet;

import java.util.Arrays;
import java.util.HashMap;
// 1
public class TwoSum {

    public static void main(String[] args) {
        int [] result = twoSum(new int[] {5,4,3} , 9);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> itemsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];
            if(itemsMap.containsKey(compliment)){
                return new int[] {itemsMap.get(compliment), i };
            }else{
                itemsMap.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No Match Found");
    }

}

