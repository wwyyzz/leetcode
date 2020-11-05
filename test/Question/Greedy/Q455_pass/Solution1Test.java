package Question.Greedy.Q455_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findContentChildren() {
        int[] g = {5,10,2,9,15,9};
        int[] s = {6,1,20,3,8};

        assertEquals(3, new Solution1().findContentChildren(g, s));
    }

    @Test
    public void findContentChildren2() {
        int[] g = {1,2,3};
        int[] s = {1,1};

        assertEquals(1, new Solution1().findContentChildren(g, s));
    }

    @Test
    public void findContentChildren3() {
        int[] g = {1,2};
        int[] s = {1,2,3};

        assertEquals(2, new Solution1().findContentChildren(g, s));
    }
}