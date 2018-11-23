package Q14;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void longestCommonPrefix() {
        assertEquals("fl", new Solution1().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", new Solution1().longestCommonPrefix(new String[]{"dog","racecar","car"}));
//        assertEquals("", new Solution1().longestCommonPrefix(new String[]{}));
    }
}