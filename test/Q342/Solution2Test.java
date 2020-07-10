package Q342;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class Solution2Test {


    @Test
    public void isPowerOfFour() {

        assertEquals(true,new Solution2().isPowerOfFour(1024));
        assertEquals(false,new Solution2().isPowerOfFour(1025));
        assertEquals(true,new Solution2().isPowerOfFour(16));
        assertEquals(false,new Solution2().isPowerOfFour(17));
        assertEquals(false,new Solution2().isPowerOfFour(100));
        assertEquals(true,new Solution2().isPowerOfFour(256));
        assertEquals(false,new Solution2().isPowerOfFour(2048));
        assertEquals(false,new Solution2().isPowerOfFour(0));
    }
}
