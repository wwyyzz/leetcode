package Interview.Q0102_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void checkPermutation() {
        String s1 = "abc";
        String s2 = "bca";

        assertTrue(new Solution1().CheckPermutation(s1, s2));
    }
}