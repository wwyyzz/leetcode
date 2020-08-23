package Question.array.Q1299_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void replaceElements() {
        int[] arr = {17,18,5,4,6,1};
        int[] result = {18,6,6,6,1,-1};

        assertArrayEquals(result, new Solution1().replaceElements(arr));
    }

    @Test
    public void replaceElements2() {
        int[] arr = {1,2,3,4,5,6,7,8,9,0,-1,-2,-3};
        int[] result = {9, 9, 9, 9, 9, 9, 9, 9, 0, -1, -2, -3, -1};

        assertArrayEquals(result, new Solution1().replaceElements(arr));
    }

    @Test
    public void replaceElements3() {
        int[] arr = {400};
        int[] result = {-1};

        assertArrayEquals(result, new Solution1().replaceElements(arr));
    }
}