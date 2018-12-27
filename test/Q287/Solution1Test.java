package Q287;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findDuplicate() {
        assertEquals(2, new Solution1().findDuplicate(new int[]{1,3,4,2,2}));
        assertEquals(3, new Solution1().findDuplicate(new int[]{3,1,3,4,2}));
    }

    @Test
    public void findDuplicate2() {
        assertEquals(2, new Solution2().findDuplicate(new int[]{1,3,4,2,2}));
        assertEquals(3, new Solution2().findDuplicate(new int[]{3,1,3,4,2}));
    }
}