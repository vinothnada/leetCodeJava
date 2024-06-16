public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsertPos(new int[]{1,3,5,6}, 0));
    }

    private static int searchInsertPos(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }else if( i < nums.length -1 && nums[i] < target && nums[i + 1] > target ){
                return i + 1;
            }
        }
        return nums.length;
    }

}
