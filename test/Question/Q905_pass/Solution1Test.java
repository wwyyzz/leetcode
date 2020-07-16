package Question.Q905_pass;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Ignore
    @Test
    public void sortArrayByParity() {
        assertArrayEquals(new int[]{4,2,1,3}, new Solution1().sortArrayByParity(new int[]{3,1,2,4}));
        assertArrayEquals(new int[]{0,2}, new Solution1().sortArrayByParity(new int[]{0,2}));
        assertArrayEquals(new int[]{0,2,1}, new Solution1().sortArrayByParity(new int[]{0,2,1}));
    }

    @Test
    public void sortArrayByParity2() {
        assertArrayEquals(new int[]{2,4,3,1}, new Solution2().sortArrayByParity(new int[]{3,1,2,4}));
        assertArrayEquals(new int[]{0,2}, new Solution2().sortArrayByParity(new int[]{0,2}));
        assertArrayEquals(new int[]{0,2,1}, new Solution2().sortArrayByParity(new int[]{0,2,1}));
    }
}