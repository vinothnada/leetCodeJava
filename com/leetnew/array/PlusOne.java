package com.leetnew.array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
                System.out.println(Arrays.toString(plusOneMethod(new int[]{9,9,9})));

    }

    public static int[] plusOneMethod(int[] nums){
        Boolean inc = true;
        for(int i = nums.length -1 ; i >= 0; i-- ){
            if(inc == true){
                if(nums[i] == 9){
                    nums[i] = 0;
                }else{
                    nums[i] ++;
                    inc = false;
                }
            }

            if(nums[0] == 0){
                int[] arr1 = new int[nums.length + 1];
                arr1[0] = 1;
                nums =  arr1; 
            }
        }
        return nums;
    }
}
