package Contest.W206.Q5511_pass;

import junit.framework.TestCase;

public class Solution1Test extends TestCase {

    public void testNumSpecial() {
        int[][] mat = {
                {1,0,0},
                {0,0,1},
                {1,0,0},
        };

        assertEquals(1, new Solution1().numSpecial(mat));
    }

    public void testNumSpecial2() {
        int[][] mat = {
                {1,0,0},
                {0,1,0},
                {0,0,1},
        };

        assertEquals(3, new Solution1().numSpecial(mat));
    }
}