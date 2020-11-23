package Question.Q452_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findMinArrowShots() {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};

        assertEquals(2, new Solution1().findMinArrowShots(points));
    }

    @Test
    public void findMinArrowShots2() {
        int[][] points = {{1,2},{3,4},{5,6},{7,8}};

        assertEquals(4, new Solution1().findMinArrowShots(points));
    }

    @Test
    public void findMinArrowShots3() {
        int[][] points = {{1,2},{3,4},{2,3},{4,5}};

        assertEquals(2, new Solution1().findMinArrowShots(points));
    }

    @Test
    public void findMinArrowShots4() {
        int[][] points = {{1,2}};

        assertEquals(1, new Solution1().findMinArrowShots(points));
    }

    @Test
    public void findMinArrowShots5() {
        int[][] points = {{2,3},{2,3}};

        assertEquals(1, new Solution1().findMinArrowShots(points));
    }
}