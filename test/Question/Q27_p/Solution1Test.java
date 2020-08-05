package Question.Q27_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void removeElement() {
//        assertEquals(2, new Solution1().removeElement(new int[]{3,2,2,3},3));
//        assertEquals(5, new Solution1().removeElement(new int[]{0,1,2,2,3,0,4,2},2));

        assertEquals(2, new Solution2().removeElement(new int[]{3,2,2,3},3));
        assertEquals(5, new Solution2().removeElement(new int[]{0,1,2,2,3,0,4,2},2));

    }
}