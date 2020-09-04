package Question.String.Q537;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void complexNumberMultiply() {
        assertEquals("0+2i", new Solution1().complexNumberMultiply("1+1i","1+1i"));
        assertEquals("0+-2i", new Solution1().complexNumberMultiply("1+-1i","1+-1i"));
    }
}