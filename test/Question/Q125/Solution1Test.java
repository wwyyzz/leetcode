package Question.Q125;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isPalindrome() {
        assertTrue(new Solution1().isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(new Solution1().isPalindrome("race a car"));
        assertTrue(new Solution1().isPalindrome(" "));
    }
}