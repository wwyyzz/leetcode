package Question.Array.Q861;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void matrixScore() {
        int[][] matrix = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};

        assertEquals(39 , new Solution1().matrixScore(matrix));
    }
}