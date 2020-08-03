package Question.Q1356;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void sortByBits() {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] result = {0,1,2,4,8,3,5,6,7};

        assertArrayEquals(result, new Solution1().sortByBits(arr));
    }
}