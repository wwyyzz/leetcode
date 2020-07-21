package Question.Q151;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {
    String s1 = "the sky is blue";
    String result1 ="blue is sky the";

    String s2 = "  hello world!  ";
    String result2 ="world! hello";

    String s3 = "a good   example";
    String result3 = "example good a";

    @Test
    public void reverseWords() {

        assertEquals(result1, new Solution1().reverseWords(s1));
        assertEquals(result2, new Solution1().reverseWords(s2));
        assertEquals(result3, new Solution1().reverseWords(s3));
    }
}