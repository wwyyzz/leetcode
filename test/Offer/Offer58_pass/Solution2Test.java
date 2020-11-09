package Offer.Offer58_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void reverseLeftWords() {
        assertEquals("cdefgab", new Solution2().reverseLeftWords("abcdefg", 2));
    }

    @Test
    public void reverseLeftWords2() {

        assertEquals("umghlrlose", new Solution2().reverseLeftWords("lrloseumgh", 6));
    }
}