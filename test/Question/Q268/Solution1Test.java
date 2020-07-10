package Question.Q268;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void missingNumber() {
        assertEquals(2, new Solution1().missingNumber(new int[]{3,0,1}));
        assertEquals(8, new Solution1().missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}