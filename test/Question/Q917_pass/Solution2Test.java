package Question.Q917_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {
    String s1 = "ab-cd";
    String s2 = "a-bC-dEf-ghIj";
    String s3 = "Test1ng-Leet=code-Q!";
    String s4 = "F`abk";

    String result1 = "dc-ba";
    String result2 = "j-Ih-gfE-dCba";
    String result3 = "Qedo1ct-eeLg=ntse-T!";
    String result4 = "k`baF";

    @Test
    public void reverseOnlyLetters() {
        assertEquals(result1, new Solution2().reverseOnlyLetters(s1));
        assertEquals(result2, new Solution2().reverseOnlyLetters(s2));
        assertEquals(result3, new Solution2().reverseOnlyLetters(s3));
        assertEquals(result4, new Solution2().reverseOnlyLetters(s4));
    }
}