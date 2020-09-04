package Question.String.Q541_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    String s1 = "abcdefg";
    String s2 = "abcdefghijklmnopqrst";

    @Test
    public void reverseStr() {
        assertEquals("bacdfeg",new Solution1().reverseStr(s1, 2 ));
        assertEquals("cbadefg",new Solution1().reverseStr(s1, 3 ));
        assertEquals("bacdfeghjiklnmoprqst",new Solution1().reverseStr(s2, 2 ));
    }
}