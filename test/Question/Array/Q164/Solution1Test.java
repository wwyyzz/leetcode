package Question.Array.Q164;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void maximumGap() {
        int[] nums = {3,6,9,1};
        assertEquals(3, new Solution1().maximumGap(nums));
    }
}