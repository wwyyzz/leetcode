package Question.Array.Q56_p;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void merge() {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};

        new Solution1().merge(intervals);
    }
}