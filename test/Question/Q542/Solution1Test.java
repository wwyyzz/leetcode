package Question.Q542;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void updateMatrix() {
        int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        new Solution1().updateMatrix(matrix);
    }
}