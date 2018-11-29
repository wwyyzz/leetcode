package Q326;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPowerOfThree1() {

        assertEquals(true, new Solution().isPowerOfThree(27));
        assertEquals(false, new Solution().isPowerOfThree(28));
        assertEquals(true, new Solution().isPowerOfThree(81));

    }
    @Test
    public void isPowerOfThree2() {

        assertEquals(true, new Solution2().isPowerOfThree(27));
        assertEquals(false, new Solution2().isPowerOfThree(28));
        assertEquals(true, new Solution2().isPowerOfThree(81));

    }
    @Test
    public void isPowerOfThree3() {

        assertEquals(true, new Solution3().isPowerOfThree(27));
        assertEquals(false, new Solution3().isPowerOfThree(28));
        assertEquals(true, new Solution3().isPowerOfThree(81));
    }
}