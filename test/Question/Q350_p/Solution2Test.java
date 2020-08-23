package Question.Q350_p;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution2Test {

    @Test
    public void intersect() {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] result = {2,2};

        assertArrayEquals(result, new Solution2().intersect(num1,num2));
    }

    @Test
    public void intersect2() {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2};
        int[] result = {2};

        assertArrayEquals(result, new Solution2().intersect(num1,num2));
    }

    @Test
    public void intersect3() {
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        int[] result = {4,9};

        assertArrayEquals(result, new Solution2().intersect(num1,num2));
    }

    @Test
    public void intersect4() {
        int[] num1 = {1,2,2,1,3,3,3,2,1};
        int[] num2 = {1,2,2,3,4};
        int[] result = {1,2,2,3};

        assertArrayEquals(result, new Solution2().intersect(num1,num2));
    }

}