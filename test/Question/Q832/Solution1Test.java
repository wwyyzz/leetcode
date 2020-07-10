package Question.Q832;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {
    int[][] input1 ={{1,1,0},{1,0,1},{0,0,0}};
    int[][] result1 ={{1,0,0},{0,1,0},{1,1,1}};

    int[][] input2 ={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
    int[][] result2 ={{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}};

    @Test
    public void flipAndInvertImage() {
        assertArrayEquals(result1, new Solution1().flipAndInvertImage(input1));
        assertArrayEquals(result2, new Solution1().flipAndInvertImage(input2));
    }

    @Test
    public void flipAndInvertImage2() {
        assertArrayEquals(result1, new Solution2().flipAndInvertImage(input1));
        assertArrayEquals(result2, new Solution2().flipAndInvertImage(input2));
    }
}