package Question.Q344_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {
    char[] s1 = {'h','e','l','l','o'};
    char[] s2 = {'H','a','n','n','a','h'};

    @Test
    public void reverseString() {
        new Solution1().reverseString(s1);
        new Solution1().reverseString(s2);
    }
}