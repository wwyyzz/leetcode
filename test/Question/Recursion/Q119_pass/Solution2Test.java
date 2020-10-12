package Question.Recursion.Q119_pass;

import org.junit.Test;

import java.util.List;

public class Solution2Test {

    @Test
    public void getRow() {
        List<Integer> result = new Solution2().getRow(5);
        System.out.println(result);
    }

    @Test
    public void getRow2() {
        List<Integer> result = new Solution2().getRow(20);
        System.out.println(result);
    }

    @Test
    public void getRow3() {
        List<Integer> result = new Solution2().getRow(6);
        System.out.println(result);
    }

    @Test
    public void getRow4() {
        List<Integer> result = new Solution2().getRow(3);
        System.out.println(result);
    }

    @Test
    public void getRow5() {
        List<Integer> result = new Solution2().getRow(0);
        System.out.println(result);
    }

    @Test
    public void getRow6() {
        List<Integer> result = new Solution2().getRow(1);
        System.out.println(result);
    }
}