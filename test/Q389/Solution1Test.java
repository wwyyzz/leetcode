package Q389;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

//    @Test
//    public void findTheDifference() {
//        assertEquals('e', new Solution1().findTheDifference("abcd","abcde"));
//    }

    @Test
    public void findTheDifference2() {
        assertEquals('e', new Solution2().findTheDifference("abcd","abcde"));
    }

    @Test
    public void findTheDifference3() {
        assertEquals('e', new Solution3().findTheDifference("abcd","abcde"));
    }
}