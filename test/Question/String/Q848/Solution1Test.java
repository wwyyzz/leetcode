package Question.String.Q848;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void shiftingLetters() {
        assertEquals("rpl", new Solution1().shiftingLetters("abc", new int[]{3,5,9}));
    }
}