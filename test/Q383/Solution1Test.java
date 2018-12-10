package Q383;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void canConstruct() {
        assertEquals(false, new Solution1().canConstruct("a","b"));
        assertEquals(false, new Solution1().canConstruct("aa","ab"));
        assertEquals(true, new Solution1().canConstruct("aa","aab"));
    }
}