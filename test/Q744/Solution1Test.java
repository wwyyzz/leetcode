package Q744;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void nextGreatestLetter() {
        assertEquals('c', new Solution1().nextGreatestLetter(new char[]{'c', 'f','j'}, 'a'));
        assertEquals('f', new Solution1().nextGreatestLetter(new char[]{'c', 'f','j'}, 'c'));
        assertEquals('f', new Solution1().nextGreatestLetter(new char[]{'c', 'f','j'}, 'd'));
        assertEquals('j', new Solution1().nextGreatestLetter(new char[]{'c', 'f','j'}, 'g'));
        assertEquals('c', new Solution1().nextGreatestLetter(new char[]{'c', 'f','j'}, 'j'));
    }
}