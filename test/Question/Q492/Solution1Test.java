package Question.Q492;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] result1 = {2, 2};
    int[] result2 = {10, 12};
    int[] result3 = {1, 13};

    @Test
    public void constructRectangle() {
        assertArrayEquals(result1, new Solution1().constructRectangle(4));
        assertArrayEquals(result2, new Solution1().constructRectangle(120));
        assertArrayEquals(result3, new Solution1().constructRectangle(13));
    }
}