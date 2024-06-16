import java.util.ArrayList;
import java.util.List;

public class Range {
    public static void main(String[] args) {
     System.out.println(summaryRanges(new int[] {0,1,2,4,5,7}));   
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        int temp = 0;
        for(int i=0; i<nums.length - 1; i++){
            if(nums[i + 1] - nums[i] == 1){
                temp = nums[i];
            }else{
                output.add(String.valueOf(nums[i]));
            }
        }
        return output;
    }    
}
