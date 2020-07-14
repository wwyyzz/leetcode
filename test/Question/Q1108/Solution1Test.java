package Question.Q1108;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    String str1 = "1.1.1.1";
    String str2 = "255.100.50.0";

    String result1 = "1[.]1[.]1[.]1";
    String result2 = "255[.]100[.]50[.]0";

    @Test
    public void defangIPaddr() {
        assertEquals(result1, new Solution1().defangIPaddr(str1));
        assertEquals(result2, new Solution1().defangIPaddr(str2));
    }
}