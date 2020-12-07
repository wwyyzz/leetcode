package Question.String.Q482_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void licenseKeyFormatting() {
        String S = "5F3Z-2e-9-w";

        assertEquals("5F3Z-2E9W", new Solution1().licenseKeyFormatting(S,4));
    }

    @Test
    public void licenseKeyFormatting2() {
        String S = "2-5g-3-J";

        assertEquals("2-5G-3J", new Solution1().licenseKeyFormatting(S,2));
    }
}