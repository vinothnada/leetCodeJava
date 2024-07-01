
import java.util.Arrays;
import java.util.HashMap;

//26
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,2,3,4,5,6,6,6,7,7,7,8,8,9,9,9}));
    }

    static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(i<nums.length - 1 && nums[i] == nums[i+1]){
                continue;
            }
            nums[count] = nums[i];
            count ++;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
