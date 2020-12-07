package Question.Array.Q287_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findDuplicate() {
        int[] nums = {1,3,4,2,2};

        assertEquals(2, new Solution1().findDuplicate(nums));
    }
}