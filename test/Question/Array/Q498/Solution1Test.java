package Question.Array.Q498;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void findDiagonalOrder() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        new Solution1().findDiagonalOrder(matrix);
    }

    @Test
    public void findDiagonalOrder2() {
        int[][] matrix = {{2,3}};

        new Solution1().findDiagonalOrder(matrix);
    }
}