package Contest.W214.Q5562;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void minDeletions() {
        assertEquals(2, new Solution1().minDeletions("aabbbccc"));
    }
    @Test
    public void minDeletions2() {
        assertEquals(3, new Solution1().minDeletions("abcabc"));
    }
}