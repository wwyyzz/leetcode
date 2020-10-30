package Question.HashTable.Q953;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isAlienSorted() {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(new Solution1().isAlienSorted(words,order));
    }
}