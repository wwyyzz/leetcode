package Question.Q551;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void checkRecord() {
        assertEquals(true, new Solution1().checkRecord("PPALLP"));
        assertEquals(false, new Solution1().checkRecord("PPALLL"));
    }
}