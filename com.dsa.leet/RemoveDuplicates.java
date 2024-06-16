public class RemoveDuplicates {
    public static void main(String[] args) throws Exception {
        System.out.println(removeDuplicatesfunc(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    static int removeDuplicatesfunc(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(i < nums.length -1 && nums[i] == nums[i+1]){
                continue;
            }
            nums[count] = nums[i];
            count ++;
        }
        return count;
    }
}
