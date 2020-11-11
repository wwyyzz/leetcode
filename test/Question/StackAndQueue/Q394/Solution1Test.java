package Question.StackAndQueue.Q394;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void decodeString() {
        assertEquals("aaabcbc", new Solution1().decodeString("3[a]2[bc]"));
    }

    @Test
    public void decodeString2() {
        assertEquals("accaccacc", new Solution1().decodeString("3[a2[c]]"));
    }

    @Test
    public void decodeString3() {
        assertEquals("abcabccdcdcdef", new Solution1().decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void decodeString4() {
        assertEquals("abccdcdcdxyz", new Solution1().decodeString("abc3[cd]xyz"));
    }

    @Test
    public void decodeString5() {
        assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", new Solution1().decodeString("100[leetcode]"));
    }

    @Test
    public void decodeString6() {
        assertEquals("aaabcbc", new Solution1().decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"
        ));
    }
}