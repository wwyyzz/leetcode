package Question.Q739_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void dailyTemperatures() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, new Solution1().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));

    }
}