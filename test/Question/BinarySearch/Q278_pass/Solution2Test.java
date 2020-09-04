package Question.BinarySearch.Q278_pass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void firstBadVersion() {
        assertEquals(4,new Solution2().firstBadVersion(5));
    }

    @Test
    public void firstBadVersion2() {
        assertEquals(5,new Solution2().firstBadVersion(10));
    }
}