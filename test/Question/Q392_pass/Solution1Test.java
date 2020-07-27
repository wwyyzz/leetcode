package Question.Q392_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isSubsequence1() {
        String s = "abc";
        String t = "ahbgdc";

        assertEquals(true, new Solution1().isSubsequence(s,t));
    }

    @Test
    public void isSubsequence2() {
        String s = "axc";
        String t = "ahbgdc";

        assertEquals(false, new Solution1().isSubsequence(s,t));
    }

    @Test
    public void isSubsequence3() {
        String s = "aaaaaa";
        String t = "bbaaaa";

        assertEquals(false, new Solution1().isSubsequence(s,t));
    }
}