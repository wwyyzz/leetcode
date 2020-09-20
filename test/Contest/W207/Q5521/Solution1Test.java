package Contest.W207.Q5521;

import junit.framework.TestCase;

public class Solution1Test extends TestCase {

    public void testMaxProductPath() {

        int[][] grid = new int[][]{
                {1,-2,1},
                {1,-2,1},
                {3,-4,1}};

        assertEquals(8 , new Solution1().maxProductPath(grid));
    }
}