package com.dsa.leet;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {1,2,2,3,4,4,5}, 2));
    }

    static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
