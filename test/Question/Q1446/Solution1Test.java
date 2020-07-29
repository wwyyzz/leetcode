package Question.Q1446;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void maxPower() {
        String s1 = "leetcode";
        String s2 = "abbcccddddeeeeedcba";
        String s3 = "triplepillooooow";
        String s4 = "hooraaaaaaaaaaay";
        String s5 =  "tourist";


        assertEquals(2, new Solution1().maxPower(s1));
        assertEquals(5, new Solution1().maxPower(s2));
        assertEquals(5, new Solution1().maxPower(s3));
        assertEquals(11, new Solution1().maxPower(s4));
        assertEquals(1, new Solution1().maxPower(s5));
    }
}