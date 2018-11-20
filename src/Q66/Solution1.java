package Q66;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
//        int[] nums = {9};
//        int[] nums = {1, 2, 3};
//        int[] nums = {1,9 , 9, 9};
        int MIN_ARRAY_SORT_GRAN = 1 << 13;
        System.out.println("MIN = "+ MIN_ARRAY_SORT_GRAN);

        int[] nums = {9,9 , 9, 9};

        int[] result = new s1().plusOne(nums );

        System.out.println(Arrays.toString(result));

    }


}

class s1{
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        Arrays.fill(result, 0);
        result[0] = 1;

        for (int i = digits.length - 1; i >=0 ; i--) {
            if (digits[i] == 9 ){
                if (i == 0){
                    return result;
                }

                digits[i] = 0;

                continue;
            }

            else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }
}