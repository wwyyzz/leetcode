package Q628;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void maximumProduct() {
        assertEquals(6, new Solution1().maximumProduct(new int[]{1,2,3}));
        assertEquals(24, new Solution1().maximumProduct(new int[]{1,2,3,4}));
        assertEquals(120, new Solution1().maximumProduct(new int[]{6,5,3,4}));
        assertEquals(720, new Solution1().maximumProduct(new int[]{-4,-3,-2,-1,60}));
    }
}