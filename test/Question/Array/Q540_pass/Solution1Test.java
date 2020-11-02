package Question.Array.Q540_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void singleNonDuplicate() {
        int [] nums = {1,1,2,3,3,4,4,8,8};

        assertEquals(2, new Solution1().singleNonDuplicate(nums));
    }

    @Test
    public void singleNonDuplicate2() {
        int [] nums = {3,3,7,7,10,11,11};

        assertEquals(10, new Solution1().singleNonDuplicate(nums));
    }

    @Test
    public void singleNonDuplicate3() {
        int [] nums = {1,1,2};

        assertEquals(2, new Solution1().singleNonDuplicate(nums));
    }

    @Test
    public void singleNonDuplicate4() {
        int [] nums = {1};

        assertEquals(1, new Solution1().singleNonDuplicate(nums));
    }
}