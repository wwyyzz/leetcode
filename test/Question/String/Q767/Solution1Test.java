package Question.String.Q767;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void reorganizeString() {
        String S = "aaabbbbcc";
        new Solution1().reorganizeString(S);
    }

    @Test
    public void reorganizeString2() {
        String S = "aaab";
        String s = new Solution1().reorganizeString(S);
        System.out.println("s =" + s);
    }
}