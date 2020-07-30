package Question.Q1309_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    String s1 = "10#11#12";
    String s2 = "1326#";
    String s3 = "25#";
    String s4 = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";

    @Test
    public void freqAlphabets() {
        assertEquals("jkab", new Solution1().freqAlphabets(s1));
        assertEquals("acz", new Solution1().freqAlphabets(s2));
        assertEquals("y", new Solution1().freqAlphabets(s3));
        assertEquals("abcdefghijklmnopqrstuvwxyz", new Solution1().freqAlphabets(s4));
    }
}