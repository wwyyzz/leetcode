package Question.TwoPointers.Q344_2_pass;

import org.junit.Test;

public class Solution1Test {
    char[] s1 = {'h','e','l','l','o'};
    char[] s2 = {'H','a','n','n','a','h'};

    @Test
    public void reverseString() {
        new Solution1().reverseString(s1);
        new Solution1().reverseString(s2);
    }
}