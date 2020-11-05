package Question.Greedy.Q376_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void wiggleMaxLength() {
        int[] nums = {1,17,5,10,13,15,10,5,16,8};

        assertEquals(7, new Solution1().wiggleMaxLength(nums));
    }
}