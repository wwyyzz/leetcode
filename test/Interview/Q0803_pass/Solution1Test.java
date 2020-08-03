package Interview.Q0803_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] nums1 ={0, 2, 4, 4,5};
    int result1 = 0;

    int[] nums2 = {1,1,1};
    int result2 = 1;

    @Test
    public void findMagicIndex() {
        assertEquals(result1, new Solution1().findMagicIndex(nums1));
        assertEquals(result2, new Solution1().findMagicIndex(nums2));
    }
}