package Question.Q506_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findRelativeRanks1() {
        int[] nums ={5,4,3,2,1};
        String[] result = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};

        assertArrayEquals(result, new Solution1().findRelativeRanks(nums));

    }

    @Test
    public void findRelativeRanks2() {
        int[] nums ={10,3,8,9,4};
        String[] result = {"Gold Medal","5","Bronze Medal","Silver Medal","4"};

        assertArrayEquals(result, new Solution1().findRelativeRanks(nums));

    }
}