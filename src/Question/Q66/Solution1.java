package Question.Q66;

import java.util.Arrays;

public class Solution1 {

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