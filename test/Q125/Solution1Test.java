package Q125;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isPalindrome() {
        assertEquals(true, new Solution1().isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, new Solution1().isPalindrome("race a car"));
        assertEquals(true, new Solution1().isPalindrome(" "));
    }
}