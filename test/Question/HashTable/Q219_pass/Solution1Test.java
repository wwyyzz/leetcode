package Question.HashTable.Q219_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void containsNearbyDuplicate() {
        assertFalse(new Solution1().containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));

    }
}