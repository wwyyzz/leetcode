package Question.Q400;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findNthDigit() {
        assertEquals(3, new Solution1().findNthDigit(3));
        assertEquals(0, new Solution1().findNthDigit(11));
        assertEquals(0, new Solution1().findNthDigit(20));
        assertEquals(0, new Solution1().findNthDigit(100));
    }
}