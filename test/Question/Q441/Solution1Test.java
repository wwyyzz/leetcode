package Question.Q441;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void arrangeCoins() {
        assertEquals(3, new Solution1().arrangeCoins(8));
    }

    @Test
    public void arrangeCoins2() {
        assertEquals(2, new Solution1().arrangeCoins(5));
    }

    @Test
    public void arrangeCoins3() {
        assertEquals(1, new Solution1().arrangeCoins(1));
    }
}