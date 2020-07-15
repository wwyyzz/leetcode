package Question.Q1486;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void xorOperation() {
        assertEquals(8 , new Solution1().xorOperation(5, 0));
        assertEquals(8 , new Solution1().xorOperation(4, 3));
        assertEquals(7 , new Solution1().xorOperation(1, 7));
        assertEquals(2 , new Solution1().xorOperation(10, 5));
    }
}