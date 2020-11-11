package Question.DFSAndBFS.Q200_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void numIslands() {
        char[][] grid = {
                    {'1','1','1','1','0'},
                    {'1','1','0','1','0'},
                    {'1','1','0','0','0'},
                    {'0','0','0','0','0'}
                    };
        
        assertEquals(1, new Solution1().numIslands(grid));
        
    }

    @Test
    public void numIslands2() {
        char[][] grid = {
                    {'1','1','0','0','0'},
                    {'1','1','0','0','0'},
                    {'0','0','1','0','0'},
                    {'0','0','0','1','1'}
                    };

        assertEquals(3, new Solution1().numIslands(grid));

    }
}