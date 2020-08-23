package Question.string.Q14_pass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void longestCommonPrefix() {
        assertEquals("", new Solution2().longestCommonPrefix(new String[]{}));
        assertEquals("fl", new Solution2().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", new Solution2().longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("abc", new Solution2().longestCommonPrefix(new String[]{"abcd","abcda","abcdef","abcdabcd","abcg"}));
//        assertEquals("", new Solution1().longestCommonPrefix(new String[]{}));
    }
}