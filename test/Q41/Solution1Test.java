package Q41;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void firstMissingPositive() {
        assertEquals(3, new Solution1().firstMissingPositive(new int[]{1,2,0}));
        assertEquals(2, new Solution1().firstMissingPositive(new int[]{3,4,-1,1}));
        assertEquals(1, new Solution1().firstMissingPositive(new int[]{7,8,9,11,12}));
    }
}