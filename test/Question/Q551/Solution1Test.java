package Question.Q551;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void checkRecord() {
        assertTrue(new Solution1().checkRecord("PPALLP"));
        assertFalse(new Solution1().checkRecord("PPALLL"));
    }
}