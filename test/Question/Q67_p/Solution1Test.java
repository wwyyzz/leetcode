package Question.Q67_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void addBinary() {
        String a = "1010";
        String b = "101011";

        assertEquals("110101", new Solution1().addBinary(a,b));
    }

    @Test
    public void addBinary2() {
        String a = "1010";
        String b = "1011";

        assertEquals("10101", new Solution1().addBinary(a,b));
    }

    @Test
    public void addBinary3() {
        String a = "11";
        String b = "1";

        assertEquals("100", new Solution1().addBinary(a,b));
    }
}