package Question.array.Q75;

import Question.array.Q48_pass.Solution2;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void sortColors() {
        int[] nums = {2,0,2,1,1,0};

        new Solution1().sortColors(nums);
    }
}