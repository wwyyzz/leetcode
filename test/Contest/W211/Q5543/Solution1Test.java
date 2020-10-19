package Contest.W211.Q5543;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void maxLengthBetweenEqualCharacters() {
        String s = "cabbac";
        assertEquals(4, new Solution1().maxLengthBetweenEqualCharacters(s));
    }

    @Test
    public void maxLengthBetweenEqualCharacters2() {
        String s = "cbzxy";
        assertEquals(-1, new Solution1().maxLengthBetweenEqualCharacters(s));
    }

    @Test
    public void maxLengthBetweenEqualCharacters3() {
        String s = "abca";
        assertEquals(2, new Solution1().maxLengthBetweenEqualCharacters(s));
    }

    @Test
    public void maxLengthBetweenEqualCharacters4() {
        String s = "aa";
        assertEquals(0, new Solution1().maxLengthBetweenEqualCharacters(s));
    }
}