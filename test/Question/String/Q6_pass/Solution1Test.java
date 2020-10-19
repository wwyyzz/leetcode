package Question.String.Q6_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void convert() {
        String s = "LEETCODEISHIRING";
        int numRows = 4;

        String result = "LCIRETOESIIGEDHN";

        assertEquals(result, new Solution1().convert(s, 3));
    }

    @Test
    public void convert2() {
        String s = "LEETCODEISHIRING";
        int numRows = 4;

        String result = "LDREOEIIECIHNTSG";

        assertEquals(result, new Solution1().convert(s, 4));
    }
}