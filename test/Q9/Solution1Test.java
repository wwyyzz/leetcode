package Q9;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isPalindrome() {
//        assertEquals(true, new Solution1().isPalindrome(121));
//        assertEquals(true, new Solution1().isPalindrome(1234321));
//        assertEquals(false, new Solution1().isPalindrome(-121));
//        assertEquals(false, new Solution1().isPalindrome(10));
//
//        assertEquals(true, new Solution2().isPalindrome(121));
//        assertEquals(true, new Solution2().isPalindrome(1234321));
//        assertEquals(false, new Solution2().isPalindrome(-121));
//        assertEquals(false, new Solution2().isPalindrome(10));
//        assertEquals(true, new Solution2().isPalindrome(0));

        assertEquals(true, new Solution3().isPalindrome(121));
        assertEquals(true, new Solution3().isPalindrome(1234321));
        assertEquals(false, new Solution3().isPalindrome(-121));
        assertEquals(false, new Solution3().isPalindrome(10));
        assertEquals(true, new Solution3().isPalindrome(0));
    }
}