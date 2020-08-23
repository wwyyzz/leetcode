package Question.array.Q1337_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void kWeakestRowsTest1() {
        int[][] mat = {{1,1,0,0,0},
                 {1,1,1,1,0},
                 {1,0,0,0,0},
                 {1,1,0,0,0},
                 {1,1,1,1,1}
                    };

        int[] result = {2,0,3};
        assertArrayEquals(result, new Solution1().kWeakestRows(mat,3));
    }

    @Test
    public void kWeakestRowsTest2() {
        int[][] mat = {{1,0,0,0},
             {1,1,1,1},
             {1,0,0,0},
             {1,0,0,0}
        };

        int[] result = {0,2};
        assertArrayEquals(result, new Solution1().kWeakestRows(mat,2));
    }
}