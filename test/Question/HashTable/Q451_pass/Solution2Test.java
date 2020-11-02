package Question.HashTable.Q451_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void frequencySort() {
        assertEquals("eert", new Solution2().frequencySort("tree"));
    }

    @Test
    public void frequencySort2() {
        assertEquals("cccaaa", new Solution2().frequencySort("cccaaa"));
    }


}