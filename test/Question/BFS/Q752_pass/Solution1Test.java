package Question.BFS.Q752_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void openLock() {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";

        assertEquals(6, new Solution1().openLock(deadends, target));
    }
}