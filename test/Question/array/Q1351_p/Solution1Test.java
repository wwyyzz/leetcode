package Question.array.Q1351_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countNegatives() {
        int[][] matrix = {
                {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}
        };

        assertEquals(8, new Solution1().countNegatives(matrix));
    }

    @Test
    public void countNegatives2() {
        int[][] matrix = {
                {3,2},{1,0}
        };

        assertEquals(0, new Solution1().countNegatives(matrix));
    }

    @Test
    public void countNegatives3() {
        int[][] matrix = {
                {1,-1},{-1,-1}
        };

        assertEquals(3, new Solution1().countNegatives(matrix));
    }

    @Test
    public void countNegatives4() {
        int[][] matrix = {
                {-1}
        };

        assertEquals(1, new Solution1().countNegatives(matrix));
    }
}