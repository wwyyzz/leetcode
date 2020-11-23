package Question.String.Q93_pass;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution1Test {

    static ArrayList<String> result1 = new ArrayList<>();


    @Test
    public void restoreIpAddresses() {
        result1.add("255.255.11.135");
        result1.add("255.255.111.35");

//        System.out.println(result1);

//        new Solution1().restoreIpAddresses("25525511135");
//        assertArrayEquals(result1, new Solution1().restoreIpAddresses("1111"));

        assertArrayEquals(result1, new Solution1().restoreIpAddresses("25525511135"));


    }


    @Test
    public void restoreIpAddresses2() {
        new Solution1().restoreIpAddresses("0000");
   }

    @Test
    public void restoreIpAddresses3() {
        new Solution1().restoreIpAddresses("1111");
    }

    @Test
    public void restoreIpAddresses4() {
        new Solution1().restoreIpAddresses("010010");
    }

    @Test
    public void restoreIpAddresses5() {
        new Solution1().restoreIpAddresses("101023");
    }

    @Test
    public void restoreIpAddresses6() {
        new Solution1().restoreIpAddresses("0279245587303");
    }

    @Test
    public void restoreIpAddresses7() {
        new Solution1().restoreIpAddresses("25525511135");
    }

    private void assertArrayEquals(ArrayList<String> result1, List<String> restoreIpAddresses) {
    }
}