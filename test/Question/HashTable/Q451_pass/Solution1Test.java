package Question.HashTable.Q451_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void frequencySort() {
        assertEquals("eert", new Solution1().frequencySort("tree"));
    }

    @Test
    public void frequencySort2() {
        assertEquals("cccaaa", new Solution1().frequencySort("cccaaa"));
    }

    @Test
    public void frequencySort3() {
        assertEquals("bbAa", new Solution1().frequencySort("Aabb"));
    }


}