package Question.Q506_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findRelativeRanks() {
        int[] nums ={5,4,3,2,1};
        String[] result = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};

        assertArrayEquals(result, new Solution1().findRelativeRanks(nums));

    }
}