package Interview.Q1710_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void majorityElement() {
        assertEquals(5, new Solution2().majorityElement(new int[]{1,2,5,9,5,9,5,5,5}));
    }
}