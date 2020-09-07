package Question.HashTable.Q961_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void repeatedNTimes() {
        int[] A = {1,2,3,3};
        assertEquals(3, new Solution1().repeatedNTimes(A));
    }

    @Test
    public void repeatedNTimes2() {
        int[] A = {2,1,2,5,3,2};
        assertEquals(2, new Solution1().repeatedNTimes(A));
    }

    @Test
    public void repeatedNTimes3() {
        int[] A = {5,1,5,2,5,3,5,4};
        assertEquals(5, new Solution1().repeatedNTimes(A));
    }
}