package Question.Array.Q27_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void removeElement() {
        int[] result ={2,2};

        assertEquals(2, new Solution2().removeElement(new int[]{3,2,2,3},3));
    }
}