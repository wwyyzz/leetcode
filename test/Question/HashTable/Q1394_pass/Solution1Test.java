package Question.HashTable.Q1394_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findLucky() {
        assertEquals(2, new Solution1().findLucky(new int[]{2,2,3,4}));
    }

    @Test
    public void findLucky2() {
        assertEquals(3, new Solution1().findLucky(new int[]{1,2,2,3,3,3}));
    }

    @Test
    public void findLucky3() {
        assertEquals(-1, new Solution1().findLucky(new int[]{2,2,2,3,3}));
    }

    @Test
    public void findLucky4() {
        assertEquals(-1, new Solution1().findLucky(new int[]{5}));
    }

    @Test
    public void findLucky5() {
        assertEquals(7, new Solution1().findLucky(new int[]{7,7,7,7,7,7,7}));
    }


}