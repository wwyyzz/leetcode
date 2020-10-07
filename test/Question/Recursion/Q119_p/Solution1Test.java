package Question.Recursion.Q119_p;

import org.junit.Test;

import java.util.List;

public class Solution1Test {

    @Test
    public void getRow() {
        List<Integer> result = new Solution1().getRow(5);
        System.out.println(result);
    }

    @Test
    public void getRow2() {
        List<Integer> result = new Solution1().getRow(20);
        System.out.println(result);
    }
}