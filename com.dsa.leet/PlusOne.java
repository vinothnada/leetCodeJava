import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOneMethod(new int[]{9,9,9,9,9,9})));
    }

    private static int[] plusOneMethod(int[] digits) {
        for(int i= digits.length - 1 ; i >= 0; i--){
            if(digits[i] % 10 == 9){
                digits[i] = 0;
                continue;
            }else{
                digits[i]  = ++digits[i];
                break;
            }
        }

        if(digits[0] == 0 ){
            int[] arr1 = new int[digits.length + 1];
            arr1[0] = 1;
            return arr1; 
        }
        return digits;
    }
}
