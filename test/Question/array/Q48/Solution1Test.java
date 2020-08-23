package Question.array.Q48;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void rotate() {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        new Solution1().rotate(matrix);
    }

    @Test
    public void rotate2() {
        int[][] matrix = {
                  { 5, 1, 9,11},
                  { 2, 4, 8,10},
                  {13, 3, 6, 7},
                  {15,14,12,16}
        };

        new Solution1().rotate(matrix);
    }
}