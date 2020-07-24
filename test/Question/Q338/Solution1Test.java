package Question.Q338;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int num1 = 2;
    int num2 = 5;
    int num3 = 100;

    @Test
    public void countBits() {
        new Solution1().countBits(num1);
        new Solution1().countBits(num2);
        new Solution1().countBits(num3);
    }
}