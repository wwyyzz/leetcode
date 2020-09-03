package Question.sort.Q922_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void sortArrayByParityII() {
        assertArrayEquals(new int[]{4,5,2,7}, new Solution1().sortArrayByParityII(new int[]{4,2,5,7}));
    }
}