package Question.SlidingWindow.Q3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void lengthOfLongestSubstring() {
        String s1 = "abcabcabc";
        String s2 = "bbbb";
        String s3 = "pwwkew";

        assertEquals(3, new Solution2().lengthOfLongestSubstring(s1));
        assertEquals(1, new Solution2().lengthOfLongestSubstring(s2));
        assertEquals(3, new Solution2().lengthOfLongestSubstring(s3));
    }
}