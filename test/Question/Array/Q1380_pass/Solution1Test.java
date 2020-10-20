package Question.Array.Q1380_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void luckyNumbers() {
        int[][] matrix = {{3,7,8}, {9,11,13},{15,16,17}};

        new Solution1().luckyNumbers(matrix);
    }

    @Test
    public void luckyNumbers2() {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        new Solution1().luckyNumbers(matrix);
    }

    @Test
    public void luckyNumbers3() {
        int[][] matrix = {{7,8}, {1,2}};

        new Solution1().luckyNumbers(matrix);
    }
}