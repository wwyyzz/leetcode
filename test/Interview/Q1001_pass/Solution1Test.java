package Interview.Q1001_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void merge() {
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};

        new Solution1().merge(A,3,B,3);

    }
}