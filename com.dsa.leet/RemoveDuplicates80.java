import java.util.Arrays;

/**
 * RemoveDuplicates80
 */
public class RemoveDuplicates80 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,1,2,2,3}));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(i < nums.length - 2 && ((nums[i] == nums[i+1] &&  nums[i+1] == nums[i+2])) ){
                continue ;
            }
            
            if(i < nums.length - 1 && nums[i] == nums[i+1] ){
                continue ; 
            }

            nums[count] = nums[i];
            count = count + 2;

        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}