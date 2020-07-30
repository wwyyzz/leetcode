package Question.Q414_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void thirdMax() {
        assertEquals(1, new Solution1().thirdMax(new int[]{3,2,1}));
        assertEquals(2, new Solution1().thirdMax(new int[]{1,2}));
        assertEquals(1, new Solution1().thirdMax(new int[]{2,2,3,1}));
        assertEquals(2, new Solution1().thirdMax(new int[]{1,1,2}));
        assertEquals(7, new Solution1().thirdMax(new int[]{1,1,2,3,4,5,6,7,8,9,9,9,8,7,6,2}));
    }

    @Test
    public void thirdMax2() {
        assertEquals(1, new Solution2().thirdMax(new int[]{3,2,1}));
        assertEquals(2, new Solution2().thirdMax(new int[]{1,2}));
        assertEquals(1, new Solution2().thirdMax(new int[]{2,2,3,1}));
        assertEquals(2, new Solution2().thirdMax(new int[]{1,1,2}));
        assertEquals(7, new Solution2().thirdMax(new int[]{1,1,2,3,4,5,6,7,8,9,9,9,8,7,6,2}));
    }
}