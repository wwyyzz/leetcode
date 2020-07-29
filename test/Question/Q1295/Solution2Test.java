package Question.Q1295;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void findNumbers1() {
        int[] nums = {12,345,2,6,7896};
        assertEquals(2 , new Solution2().findNumbers(nums));
    }

    @Test
    public void findNumbers2() {
        int[] nums = {555,901,482,1771};
        assertEquals(1 , new Solution2().findNumbers(nums));
    }

    @Test
    public void findNumbers3() {
        int[] nums = {1, 2, 3, 4, 22, 33, 44, 55, 6666, 8888};
        assertEquals(6 , new Solution2().findNumbers(nums));
    }

    @Test
    public void isEven() {
        new Solution2().isEven(3);
        new Solution2().isEven(13);
        new Solution2().isEven(123);
        new Solution2().isEven(1234);
    }
}