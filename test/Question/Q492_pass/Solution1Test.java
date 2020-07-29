package Question.Q492_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] result1 = {2, 2};
    int[] result2 = {12, 10};
    int[] result3 = {13, 1};
    int[] result4 = {2, 1};

    @Test
    public void constructRectangle() {
        assertArrayEquals(result1, new Solution1().constructRectangle(4));
        assertArrayEquals(result2, new Solution1().constructRectangle(120));
        assertArrayEquals(result3, new Solution1().constructRectangle(13));
        assertArrayEquals(result4, new Solution1().constructRectangle(2));
    }
}