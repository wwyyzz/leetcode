package Q557;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void reverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", new Solution1().reverseWords("Let's take LeetCode contest"));
    }
}