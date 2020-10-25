package Contest.W212.Q5547_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void checkArithmeticSubarrays() {
        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};

        new Solution1().checkArithmeticSubarrays(nums,l,r);
    }

    @Test
    public void checkArithmeticSubarrays2() {
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int[] l = {0,1,6,4,8,7};
        int[] r = {4,4,9,7,9,10};

        new Solution1().checkArithmeticSubarrays(nums,l,r);
    }
}