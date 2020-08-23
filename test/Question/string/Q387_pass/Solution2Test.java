package Question.string.Q387_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void firstUniqChar() {
        assertEquals(0, new Solution2().firstUniqChar("leetcode"));
        assertEquals(2, new Solution2().firstUniqChar("loveleetcode"));
        assertEquals(-1, new Solution2().firstUniqChar("cc"));
        assertEquals(0, new Solution2().firstUniqChar("z"));
    }
}