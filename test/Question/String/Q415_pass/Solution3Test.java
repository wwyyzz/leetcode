package Question.String.Q415_pass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {

    @Test
    public void addStrings() {
        assertEquals("10000",new Solution3().addStrings("1","9999"));
        assertEquals("10",new Solution3().addStrings("1","9"));
        assertEquals("456246",new Solution3().addStrings("123","456123"));
        assertEquals("492",new Solution3().addStrings("246","246"));
        assertEquals("1492",new Solution3().addStrings("1246","246"));
        assertEquals("6984362587",new Solution3().addStrings("6913259244","71103343"));
    }
}