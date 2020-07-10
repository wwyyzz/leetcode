package Question.Q728;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void selfDividingNumbers() {
        ArrayList<Integer> result1 = new ArrayList<>();
        result1.add(1);
        result1.add(2);
        result1.add(3);
        result1.add(4);
        result1.add(5);
        result1.add(6);
        result1.add(7);
        result1.add(8);
        result1.add(9);
        result1.add(11);
        result1.add(12);
        result1.add(15);
        result1.add(22);

        assertEquals(result1, new Solution1().selfDividingNumbers(1,22));


    }
}