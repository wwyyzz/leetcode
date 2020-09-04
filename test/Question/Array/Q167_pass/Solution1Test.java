package Question.Array.Q167_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

//    @Test
//    public void twoSum() {
//        assertArrayEquals(new int[]{1,2}, new Solution1().twoSum(new int[]{2,7,11,15},9));
//        assertArrayEquals(new int[]{1,2}, new Solution1().twoSum(new int[]{-1,0,-1},-1));
//    }

    @Test
    public void twoSum2() {
        assertArrayEquals(new int[]{1,2}, new Solution2().twoSum(new int[]{2,7,11,15},9));
        assertArrayEquals(new int[]{1,2}, new Solution2().twoSum(new int[]{-1,0,1},-1));
    }
}