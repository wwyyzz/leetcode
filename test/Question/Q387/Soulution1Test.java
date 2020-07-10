package Question.Q387;

import org.junit.Test;

import static org.junit.Assert.*;

public class Soulution1Test {

    @Test
    public void firstUniqChar() {
        assertEquals(0, new Soulution1().firstUniqChar("leetcode"));
        assertEquals(2, new Soulution1().firstUniqChar("loveleetcode"));
        assertEquals(-1, new Soulution1().firstUniqChar("cc"));
        assertEquals(0, new Soulution1().firstUniqChar("z"));
    }
}