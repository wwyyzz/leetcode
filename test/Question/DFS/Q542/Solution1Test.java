package Question.DFS.Q542;

import org.junit.Test;

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