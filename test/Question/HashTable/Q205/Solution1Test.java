package Question.HashTable.Q205;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isIsomorphic() {
        String s = "egg";
        String t = "add";
        assertTrue(new Solution1().isIsomorphic(s,t));
    }

    @Test
    public void isIsomorphic2() {
        String s = "foo";
        String t = "bar";
        assertFalse(new Solution1().isIsomorphic(s,t));
    }

    @Test
    public void isIsomorphic3() {
        String s = "paper";
        String t = "title";
        assertTrue(new Solution1().isIsomorphic(s,t));
    }
}