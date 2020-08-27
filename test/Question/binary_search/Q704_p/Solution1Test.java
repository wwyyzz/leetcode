package Question.binary_search.Q704_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void search() {
        int[] nums = {-1,0,3,5,9,12};
        assertEquals( 4, new Solution1().search(nums, 9));
    }

    @Test
    public void search2() {
        int[] nums = {-1,0,3,5,9,12};
        assertEquals( -1, new Solution1().search(nums, 2));
    }

    @Test
    public void search3() {
        int[] nums = {-1,0,1,2,3,4,5,6,7,8,9,10,12,14,16,17,18,20,21,23,25,37,40,52,60,77,83,99,100};
        assertEquals( 20, new Solution1().search(nums, 25));
    }

    @Test
    public void search4() {
        int[] nums = {-1,0,1,2,3,4,5,6,7,8,9,10,12,14,16,17,18,20,21,23,25,37,40,52,60,77,83,99,100};
        assertEquals( -1, new Solution1().search(nums, 24));
    }
}