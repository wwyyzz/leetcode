package Question.array.Q73_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void setZeroes() {
        int[][] matrix = {
                          {1,1,1},
                          {1,0,1},
                          {1,1,1}
                        };
        new Solution1().setZeroes(matrix);
    }

    @Test
    public void setZeroes2() {
        int[][] matrix = {
                          {0,1,2,0},
                          {3,4,5,2},
                          {1,3,1,5}
                        };
        new Solution1().setZeroes(matrix);
    }
}