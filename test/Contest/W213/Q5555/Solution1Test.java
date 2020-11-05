package Contest.W213.Q5555;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countVowelStrings() {
        assertEquals(15, new Solution1().countVowelStrings(2));
    }

    @Test
    public void countVowelStrings2() {
        assertEquals(35, new Solution1().countVowelStrings(3));
    }

    @Test
    public void countVowelStrings3() {
        assertEquals(66045, new Solution1().countVowelStrings(33));
    }

    @Test
    public void countVowelStrings4() {
        assertEquals(316251, new Solution1().countVowelStrings(50));
    }
}