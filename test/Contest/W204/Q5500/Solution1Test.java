package Contest.W204.Q5500;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void getMaxLen() {
        int[] arr = {1,-5,-2,4,-3};
        assertEquals(4, new Solution1().getMaxLen(arr));
    }
}