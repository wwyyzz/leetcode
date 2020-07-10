package Question.Q771;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void numJewelsInStones() {
        assertEquals(3, new Solution1().numJewelsInStones("aA","aAAbbbb"));
        assertEquals(0, new Solution1().numJewelsInStones("z","ZZ"));
    }
}