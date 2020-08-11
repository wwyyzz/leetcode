package Question.Q240_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void searchMatrix() {
        int[][] matrix = {
          {1,   4,  7, 11, 15},
          {2,   5,  8, 12, 19},
          {3,   6,  9, 16, 22},
          {10, 13, 14, 17, 24},
          {18, 21, 23, 26, 30}
        };

        assertEquals(true, new Solution1().searchMatrix(matrix, 0));
        assertEquals(false, new Solution1().searchMatrix(matrix, 20));
    }

    @Test
    public void searchMatrix2() {
        int[][] matrix = {};

        assertEquals(false, new Solution1().searchMatrix(matrix, 0));
//        assertEquals(false, new Solution1().searchMatrix(matrix, 20));
    }
}