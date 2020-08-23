package Question.Q1281_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void subtractProductAndSum() {
        assertEquals(15, new Solution1().subtractProductAndSum(234));
        assertEquals(21, new Solution1().subtractProductAndSum(4421));
    }
}