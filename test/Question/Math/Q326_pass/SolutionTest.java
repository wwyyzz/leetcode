package Question.Math.Q326_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPowerOfThree1() {

        assertTrue(new Solution().isPowerOfThree(27));
        assertFalse(new Solution().isPowerOfThree(28));
        assertTrue(new Solution().isPowerOfThree(81));

    }
    @Test
    public void isPowerOfThree2() {

        assertTrue(new Solution2().isPowerOfThree(27));
        assertFalse(new Solution2().isPowerOfThree(28));
        assertTrue(new Solution2().isPowerOfThree(81));

    }
    @Test
    public void isPowerOfThree3() {

        assertTrue(new Solution3().isPowerOfThree(27));
        assertFalse(new Solution3().isPowerOfThree(28));
        assertTrue(new Solution3().isPowerOfThree(81));
    }
}