package Question.HashTable.Q1370_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void sortString() {
        String s = "aaaabbbbcccc";
        assertEquals("abccbaabccba", new Solution2().sortString(s));
    }

    @Test
    public void sortString2() {
        String s = "rat";
        assertEquals("art", new Solution2().sortString(s));
    }

    @Test
    public void sortString3() {
        String s = "leetcode";
        assertEquals("cdelotee", new Solution2().sortString(s));
    }
}