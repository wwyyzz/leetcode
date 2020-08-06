package Question.Q796_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void rotateString1() {
        String A = "abcde";
        String B = "cdeab";

        assertEquals(true, new Solution1().rotateString(A, B));
    }

    @Test
    public void rotateString2() {
        String A = "abcde";
        String B = "abced";

        assertEquals(false, new Solution1().rotateString(A, B));
    }

    @Test
    public void rotateString3() {
        String A = "";
        String B = "";

        assertEquals(true, new Solution1().rotateString(A, B));
    }

}