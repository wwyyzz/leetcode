package Q191;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void hammingWeight() {
        assertEquals(3, new Solution1().hammingWeight(11));
        assertEquals(1, new Solution1().hammingWeight(128));
    }

    @Test
    public void hammingWeight2() {
        assertEquals(3, new Solution2().hammingWeight(11));
        assertEquals(1, new Solution2().hammingWeight(128));
    }
}