package contest.Q5177;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {
    String date1 = "20th Oct 2052";

    @Test
    public void reformatDate() {
        assertEquals("2052-10-20", new Solution1().reformatDate(date1));

    }
}