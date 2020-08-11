package Question.Q64;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void minPathSum() {

        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        assertEquals(7 , new Solution1().minPathSum(grid));
    }
}