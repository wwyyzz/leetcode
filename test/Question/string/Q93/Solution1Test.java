package Question.string.Q93;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution1Test {

    static ArrayList<String> result1 = new ArrayList<>();


    @Test
    public void restoreIpAddresses() {
        result1.add("255.255.11.135");
        result1.add("255.255.111.35");

        System.out.println(result1);

//        new Solution1().restoreIpAddresses("25525511135");
        assertArrayEquals(result1, new Solution1().restoreIpAddresses("1111"));

        assertArrayEquals(result1, new Solution1().restoreIpAddresses("25525511135"));


    }

    private void assertArrayEquals(ArrayList<String> result1, List<String> restoreIpAddresses) {
    }
}