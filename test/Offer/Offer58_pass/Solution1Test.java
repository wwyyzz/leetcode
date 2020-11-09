package Offer.Offer58_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void reverseLeftWords() {
        assertEquals("cdefgab", new Solution1().reverseLeftWords("abcdefg", 2));
    }

    @Test
    public void reverseLeftWords2() {
        assertEquals("umghlrlose", new Solution1().reverseLeftWords("lrloseumgh", 6));
    }
}