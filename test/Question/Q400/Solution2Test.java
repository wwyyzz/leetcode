package Question.Q400;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void findNthDigit() {
        assertEquals(3, new Solution2().findNthDigit(3));
        assertEquals(0, new Solution2().findNthDigit(11));
        assertEquals(1, new Solution2().findNthDigit(20));
        assertEquals(5, new Solution2().findNthDigit(100));
    }
}