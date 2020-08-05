package Question.Q1356_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void sortByBits() {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] result = {0,1,2,4,8,3,5,6,7};

        assertArrayEquals(result, new Solution2().sortByBits(arr));
    }

    @Test
    public void sortByBits2() {
        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] result = {1,2,4,8,16,32,64,128,256,512,1024};

        assertArrayEquals(result, new Solution2().sortByBits(arr));
    }

    @Test
    public void sortByBits3() {
        int[] arr = {10000,10000};
        int[] result = {10000,10000};

        assertArrayEquals(result, new Solution2().sortByBits(arr));
    }

    @Test
    public void sortByBits4() {
        int[] arr = {2,3,5,7,11,13,17,19};
        int[] result = {2,3,5,17,7,11,13,19};

        assertArrayEquals(result, new Solution2().sortByBits(arr));
    }

    @Test
    public void sortByBits5() {
        int[] arr = {10,100,1000,10000};
        int[] result = {10,100,10000,1000};

        assertArrayEquals(result, new Solution2().sortByBits(arr));
    }
}