package Q485;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findMaxConsecutiveOnes() {
        assertEquals(3 , new Solution1().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}