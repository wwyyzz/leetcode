package Question.DFS.Q733_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void floodFill() {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        new Solution1().floodFill(image, 1, 1, 2);
    }
}