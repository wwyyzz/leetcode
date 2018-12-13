package Q575;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void distributeCandies() {
        assertEquals(3 , new Solution1().distributeCandies(new int[]{1,1,2,2,3,3}));
        assertEquals(2 , new Solution1().distributeCandies(new int[]{1,1,2,3}));
        assertEquals(3 , new Solution1().distributeCandies(new int[]{1,1,1,1,2,2,2,3,3,3}));
    }
}