package Question.Array.Q973;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void kClosest() {
        int[][] points ={{1,3},{-2,2}};

        new Solution1().kClosest(points, 1);
    }

    @Test
    public void kClosest2() {
        int[][] points ={{3,3},{5,-1},{-2,4}};

        new Solution1().kClosest(points, 2);
    }
}