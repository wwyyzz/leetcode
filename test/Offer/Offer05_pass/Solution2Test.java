package Offer.Offer05_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void replaceSpace() {
        String s1 = "We are happy.";
        String result1 = "We%20are%20happy.";

        assertEquals(result1, new Solution2().replaceSpace(s1));
    }
}