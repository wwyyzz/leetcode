package Question.Q350_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void intersect() {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] result = {2,2};

        assertArrayEquals(result, new Solution1().intersect(num1,num2));
    }

    @Test
    public void intersect2() {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2};
        int[] result = {2};

        assertArrayEquals(result, new Solution1().intersect(num1,num2));
    }

    @Test
    public void intersect3() {
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        int[] result = {4,9};

        assertArrayEquals(result, new Solution1().intersect(num1,num2));
    }
}