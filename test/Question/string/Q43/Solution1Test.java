package Question.string.Q43;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void multiply() {
        String num1 = "123";
        String num2 = "456";

        assertEquals("56088", new Solution1().multiply(num1,num2));
    }
}