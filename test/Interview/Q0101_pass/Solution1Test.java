package Interview.Q0101_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isUnique() {
        String s = "leetcode";
        assertFalse(new Solution1().isUnique(s));
    }
}