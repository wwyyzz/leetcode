package Question.Math.Q868;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void binaryGap() {
        assertEquals(2, new Solution1().binaryGap(22));
        assertEquals(2, new Solution1().binaryGap(5));
        assertEquals(1, new Solution1().binaryGap(6));
    }
}