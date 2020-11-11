package Question.DFSAndBFS.Q779_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void kthGrammar() {
        assertEquals(1, new Solution1().kthGrammar(4, 5));
    }

    @Test
    public void kthGrammar2() {
        assertEquals(0, new Solution1().kthGrammar(1, 1));
    }

    @Test
    public void kthGrammar3() {
        assertEquals(0, new Solution1().kthGrammar(2, 1));
    }

    @Test
    public void kthGrammar4() {
        assertEquals(0, new Solution1().kthGrammar(30,
                434991989));
    }
}