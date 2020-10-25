package Question.Array.Q56_p;

import org.junit.Test;

public class Solution2Test {

    @Test
    public void merge() {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};

        new Solution2().merge(intervals);
    }

    @Test
    public void merge2() {
        int[][] intervals = new int[][]{{1,3},{2,6},{1, 5},{8,10},{15,18}};

        new Solution2().merge(intervals);
    }

    @Test
    public void merge3() {
        int[][] intervals = new int[][]{{2,3},{4,5},{6, 7},{8,9},{1,10}};

        new Solution2().merge(intervals);
    }
}