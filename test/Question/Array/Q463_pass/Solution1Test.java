package Question.Array.Q463_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void islandPerimeter() {
        int[][] grid = {{0,1,0,0},
                         {1,1,1,0},
                         {0,1,0,0},
                         {1,1,0,0}};

        assertEquals(16 , new Solution1().islandPerimeter(grid));
    }
}