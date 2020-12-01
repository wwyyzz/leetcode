package Question.BinarySearch.Q704_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution3Test {

    @Test
    public void search() {
        int[] nums = new int[]{-1,0,3,5,9,12};
        assertEquals(4, new Solution3().search(nums,9));
    }
}