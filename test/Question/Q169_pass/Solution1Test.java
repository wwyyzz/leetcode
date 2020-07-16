package Question.Q169_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void majorityElement() {
        assertEquals(3, new Solution1().majorityElement(new int[]{3,2,3}));
        assertEquals(2, new Solution1().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    @Test
    public void majorityElement2() {
        assertEquals(3, new Solution2().majorityElement(new int[]{3,2,3}));
        assertEquals(2, new Solution2().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}