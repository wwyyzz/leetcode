package Question.Array.Q384;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] nums = {1,2,3};


    @Test
    public void reset() {
        int[] origal = new Solution1(nums).reset();
        System.out.println(Arrays.toString(origal));
    }

    @Test
    public void shuffle() {
        for (int i = 0; i < 20; i++) {
            System.out.println((int)(Math.random() * 10 % 3));
        }

    }
}