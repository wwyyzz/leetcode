package Question.bitwise.Q461_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void hammingDistance() {
        assertEquals(2, new Solution1().hammingDistance(1,4));
        assertEquals(4, new Solution1().hammingDistance(1,14));
    }
}