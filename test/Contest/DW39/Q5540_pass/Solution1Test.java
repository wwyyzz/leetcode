package Contest.DW39.Q5540_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void maxWidthOfVerticalArea() {
        int[][] points = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};

        assertEquals( 3, new Solution1().maxWidthOfVerticalArea(points));
    }
}