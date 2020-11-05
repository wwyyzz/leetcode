package Contest.DW39.Q5541;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countSubstrings() {
        String s = "aba";
        String t = "baba";

        assertEquals(6, new Solution1().countSubstrings(s,t));
    }
}