package Question.Q917_pass;

import org.junit.Test;

public class Solution1Test {

    String s1 = "ab-cd";
    String s2 = "a-bC-dEf-ghIj";

    @Test
    public void reverseOnlyLetters() {
        new Solution1().reverseOnlyLetters(s1);
        new Solution1().reverseOnlyLetters(s2);
    }
}