package Question.String.Q415_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void addStrings() {
        assertEquals("246",new Solution2().addStrings("123","123"));
        assertEquals("492",new Solution2().addStrings("246","246"));
        assertEquals("1492",new Solution2().addStrings("1246","246"));
        assertEquals("6984362587",new Solution2().addStrings("6913259244","71103343"));
    }
}