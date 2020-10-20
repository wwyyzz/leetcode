package Question.SlidingWindow.Q3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {

    @Test
    public void lengthOfLongestSubstring() {
        String s1 = "abcabcabc";
        String s2 = "bbbb";
        String s3 = "pwwkew";

        assertEquals(3, new Solution3().lengthOfLongestSubstring(s1));
        assertEquals(1, new Solution3().lengthOfLongestSubstring(s2));
        assertEquals(3, new Solution3().lengthOfLongestSubstring(s3));
    }

    @Test
    public void lengthOfLongestSubstring2() {
        String s1 = "abcdebad";
        assertEquals(5, new Solution3().lengthOfLongestSubstring(s1));
    }
}