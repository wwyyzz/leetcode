package Q242;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isAnagram() {
//        assertEquals(true, new Solution1().isAnagram("anagram","nagaram"));
//        assertEquals(false, new Solution1().isAnagram("rat","car"));
//        assertEquals(false, new Solution1().isAnagram("aa","a"));
//        assertEquals(false, new Solution1().isAnagram("aa","a"));

        assertEquals(true, new Solution2().isAnagram("anagram","nagaram"));
        assertEquals(false, new Solution2().isAnagram("rat","car"));
        assertEquals(false, new Solution2().isAnagram("aa","a"));
        assertEquals(false, new Solution2().isAnagram("aa","a"));

    }
}