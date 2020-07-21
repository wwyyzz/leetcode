package Offer.Offer05_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    String s1 = "We are happy.";
    String result1 = "We%20are%20happy.";
    @Test
    public void replaceSpace() {
        assertEquals(result1, new Solution1().replaceSpace(s1));
    }
}