package Question.array.Q56;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void merge() {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};

        new Solution1().merge(intervals);
    }
}