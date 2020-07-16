package Question.Q172_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

//    @Test
//    public void trailingZeroes() {
//        assertEquals(0,new Solution1().trailingZeroes(3));
//        assertEquals(1,new Solution1().trailingZeroes(5));
////        assertEquals(2,new Solution1().trailingZeroes(13));
//    }

    @Test
    public void trailingZeroes2() {
        assertEquals(0,new Solution2().trailingZeroes(3));
        assertEquals(1,new Solution2().trailingZeroes(5));
        assertEquals(2,new Solution2().trailingZeroes(13));
        assertEquals(7,new Solution2().trailingZeroes(30));
        assertEquals(12,new Solution2().trailingZeroes(50));
        assertEquals(24,new Solution2().trailingZeroes(100));
//        assertEquals(452137076,new Solution2().trailingZeroes(1808548329));
//        assertEquals(452137076,new Solution2().trailingZeroes(2147483647));
    }

    @Test
    public void trailingZeroes3() {
        assertEquals(0,new Solution3().trailingZeroes(3));
        assertEquals(1,new Solution3().trailingZeroes(5));
        assertEquals(2,new Solution3().trailingZeroes(13));
        assertEquals(7,new Solution3().trailingZeroes(30));
        assertEquals(12,new Solution3().trailingZeroes(50));
        assertEquals(24,new Solution3().trailingZeroes(100));
        assertEquals(249,new Solution3().trailingZeroes(1000));
        assertEquals(452137076,new Solution3().trailingZeroes(1808548329));
        assertEquals(536870902,new Solution3().trailingZeroes(2147483647));
    }
}