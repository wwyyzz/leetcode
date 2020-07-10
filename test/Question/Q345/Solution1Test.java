package Question.Q345;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void reverseVowels() {
        assertEquals("holle", new Solution1().reverseVowels("hello"));
        assertEquals("leotcede", new Solution1().reverseVowels("leetcode"));
    }
}