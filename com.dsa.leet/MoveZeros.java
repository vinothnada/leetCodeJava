import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
          if(nums[i] == 0){
            continue;
          }
          nums[count] = nums[i];
          count ++;
        }

        for(int i=count; i<nums.length; i++){
            nums[i] = 0;
        }
        
        System.out.println(Arrays.toString(nums));
    }
}
