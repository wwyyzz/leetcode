package Contest.W203.Q1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void mostVisited() {
        int[] rounds ={1,3,1,2};

        new Solution1().mostVisited(4,rounds);
    }

    @Test
    public void mostVisited2() {
        int[] rounds ={2,1,2,1,2,1,2,1,2};

        new Solution1().mostVisited(2,rounds);
    }
}