package Question.Q645;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findErrorNums() {
        int[] nums ={1,2,2,4};
        int[] result = {2, 3};

        assertArrayEquals(result, new Solution1().findErrorNums(nums));
    }
}